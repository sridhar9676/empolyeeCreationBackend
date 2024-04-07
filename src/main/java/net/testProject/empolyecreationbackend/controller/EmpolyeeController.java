package net.testProject.empolyecreationbackend.controller;

import lombok.AllArgsConstructor;
import net.testProject.empolyecreationbackend.dto.EmpolyeeDto;
import net.testProject.empolyecreationbackend.service.EmpoyeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/empolyees")
public class EmpolyeeController {

    private EmpoyeeService empoyeeService;
     // add empolyee
    @PostMapping
    public ResponseEntity <EmpolyeeDto > createEmpolyee(@RequestBody EmpolyeeDto empolyeeDto){
        EmpolyeeDto savedEmpolyee =empoyeeService.createEmpolyee(empolyeeDto);
        return  new ResponseEntity<>(savedEmpolyee, HttpStatus.CREATED);
    }

    // get empolyee api
    @GetMapping("{id}")
    public ResponseEntity <EmpolyeeDto> getEmpolyeeById(@PathVariable("id") long employeeId){
      EmpolyeeDto empolyeeDto =  empoyeeService.getEmpolyeeById(employeeId);
      return  ResponseEntity.ok(empolyeeDto);
    }

    // get all employee
    @GetMapping
    public ResponseEntity <List<EmpolyeeDto>> getAllEmpolyees(){
        List <EmpolyeeDto> empolyees = empoyeeService.getAllEmployees();
        return ResponseEntity.ok(empolyees);

    }




}
