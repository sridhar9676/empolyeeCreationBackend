package net.testProject.empolyecreationbackend.mapper;

import net.testProject.empolyecreationbackend.dto.EmpolyeeDto;
import net.testProject.empolyecreationbackend.entity.Empolyee;
import org.springframework.beans.factory.annotation.Autowired;

public class EmpolyeeMapper {

    public static EmpolyeeDto mapToEmpolyeeDto(Empolyee empolyee){
      return  new EmpolyeeDto(
              empolyee.getId(),
              empolyee.getFirstName(),
              empolyee.getLastName(),
              empolyee.getEmail(),empolyee.getDateCreated(),empolyee.getUpdatedDate(),empolyee.getStatus()
      ) ;

    };

    public static Empolyee mapToEmpolyee(EmpolyeeDto empolyeeDto) {
        return  new Empolyee( empolyeeDto.getId(),
                empolyeeDto.getFirstName(),
                empolyeeDto.getLastName(),
                empolyeeDto.getEmail(),empolyeeDto.getDateCreated(),empolyeeDto.getUpdatedDate(),empolyeeDto.getStatus()
        );

    };




}
