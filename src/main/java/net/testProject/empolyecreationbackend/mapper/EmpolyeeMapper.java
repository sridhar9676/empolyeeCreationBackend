package net.testProject.empolyecreationbackend.mapper;

import net.testProject.empolyecreationbackend.dto.EmpolyeeDto;
import net.testProject.empolyecreationbackend.entity.Empolyee;

public class EmpolyeeMapper {

    public static EmpolyeeDto mapToEmpolyeeDto(Empolyee empolyee){
      return  new EmpolyeeDto(
              empolyee.getId(),
              empolyee.getFirstName(),
              empolyee.getLastName(),
              empolyee.getEmail()
      ) ;

    };

    public static Empolyee mapToEmpolyee(EmpolyeeDto empolyeeDto) {
        return  new Empolyee( empolyeeDto.getId(),
                empolyeeDto.getFirstName(),
                empolyeeDto.getLastName(),
                empolyeeDto.getEmail()
        );

    };

}
