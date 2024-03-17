package net.testProject.empolyecreationbackend.controller;

import lombok.AllArgsConstructor;
import net.testProject.empolyecreationbackend.dto.EmpolyeeDto;
import net.testProject.empolyecreationbackend.service.EmpoyeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/empolyees")
public class EmpolyeeController {

    private EmpoyeeService empoyeeService;

    @PostMapping
    public ResponseEntity <EmpolyeeDto > createEmpolyee(@RequestBody EmpolyeeDto empolyeeDto){
        EmpolyeeDto savedEmpolyee =empoyeeService.createEmpolyee(empolyeeDto);
        return  new ResponseEntity<>(savedEmpolyee, HttpStatus.CREATED);
    }


}
