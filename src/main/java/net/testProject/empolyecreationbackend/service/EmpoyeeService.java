package net.testProject.empolyecreationbackend.service;

import net.testProject.empolyecreationbackend.dto.EmpolyeeDto;

import java.util.List;

public interface EmpoyeeService {
    EmpolyeeDto createEmpolyee(EmpolyeeDto empolyeeDto);

    EmpolyeeDto getEmpolyeeById(long empolyeeId);

    List <EmpolyeeDto> getAllEmployees();

     EmpolyeeDto updateEmpolyee (long empolyeeId, EmpolyeeDto UpdateEmpolyee);

     void deleteEmpolyee (long empolyeeId);

}
