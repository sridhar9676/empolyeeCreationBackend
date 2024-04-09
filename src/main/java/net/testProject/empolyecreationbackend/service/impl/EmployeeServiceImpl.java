package net.testProject.empolyecreationbackend.service.impl;

import lombok.AllArgsConstructor;
import net.testProject.empolyecreationbackend.dto.EmpolyeeDto;
import net.testProject.empolyecreationbackend.entity.Empolyee;
import net.testProject.empolyecreationbackend.exception.ResourceNotFoundException;
import net.testProject.empolyecreationbackend.mapper.EmpolyeeMapper;
import net.testProject.empolyecreationbackend.repository.EmpolyeeRepository;
import net.testProject.empolyecreationbackend.service.EmpoyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmpoyeeService {

    private EmpolyeeRepository empolyeeRepository;



    @Override
    public EmpolyeeDto createEmpolyee(EmpolyeeDto empolyeeDto) {

        Empolyee empolyee = EmpolyeeMapper.mapToEmpolyee(empolyeeDto);
        Empolyee savedEmpolyee = empolyeeRepository.save(empolyee);

        return EmpolyeeMapper.mapToEmpolyeeDto(savedEmpolyee);
    }



    @Override
    public EmpolyeeDto getEmpolyeeById(long empolyeeId) {
        Empolyee empolyee = empolyeeRepository.findById(empolyeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("empolyee is not exists :" + empolyeeId));
        return EmpolyeeMapper.mapToEmpolyeeDto(empolyee);
    }

    @Override
    public List<EmpolyeeDto> getAllEmployees() {
        List <Empolyee> employees = empolyeeRepository.findAll();
        return employees.stream().map((employee) -> EmpolyeeMapper.mapToEmpolyeeDto(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmpolyeeDto updateEmpolyee(long empolyeeId, EmpolyeeDto UpdateEmpolyee) {
        Empolyee empolyee = empolyeeRepository.findById(empolyeeId).orElseThrow(
                ()-> new ResourceNotFoundException("empolyee not found with the given ID")
        );

        empolyee.setFirstName(UpdateEmpolyee.getFirstName());
        empolyee.setLastName(UpdateEmpolyee.getLastName());
        empolyee.setEmail(UpdateEmpolyee.getEmail());
        empolyee.setUpdatedDate(String.valueOf(LocalDateTime.now()));
        Empolyee updateEmpolyeObj = empolyeeRepository.save(empolyee);

        return EmpolyeeMapper.mapToEmpolyeeDto(updateEmpolyeObj);
    }

    @Override
    public void deleteEmpolyee(long empolyeeId) {
        Empolyee empolyee = empolyeeRepository.findById(empolyeeId).orElseThrow(
                ()-> new ResourceNotFoundException("Empolyee Not found with given Id")
        );

//         empolyeeRepository.deleteById(empolyeeId);
        empolyee.setStatus("0");
        empolyeeRepository.save(empolyee);
    }


}
