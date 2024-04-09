package net.testProject.empolyecreationbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpolyeeDto {

    private  long id;

    private String firstName;
    private  String lastName;
    private  String email;
    private LocalDateTime dateCreated;
    private  String updatedDate;
    private String status;



}
