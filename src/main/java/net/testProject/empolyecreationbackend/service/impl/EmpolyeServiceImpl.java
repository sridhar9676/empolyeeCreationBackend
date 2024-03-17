package net.testProject.empolyecreationbackend.service.impl;

import lombok.AllArgsConstructor;
import net.testProject.empolyecreationbackend.dto.EmpolyeeDto;
import net.testProject.empolyecreationbackend.entity.Empolyee;
import net.testProject.empolyecreationbackend.mapper.EmpolyeeMapper;
import net.testProject.empolyecreationbackend.repository.EmpolyeeRepository;
import net.testProject.empolyecreationbackend.service.EmpoyeeService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmpolyeServiceImpl implements EmpoyeeService {

    private EmpolyeeRepository empolyeeRepository;

    @Override
    public EmpolyeeDto createEmpolyee(EmpolyeeDto empolyeeDto) {

        Empolyee empolyee = EmpolyeeMapper.mapToEmpolyee(empolyeeDto);
        Empolyee savedEmpolyee = empolyeeRepository.save(empolyee);

        return EmpolyeeMapper.mapToEmpolyeeDto(savedEmpolyee);
    }
}
