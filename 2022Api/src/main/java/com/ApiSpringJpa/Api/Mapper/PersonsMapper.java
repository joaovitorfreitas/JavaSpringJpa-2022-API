package com.ApiSpringJpa.Api.Mapper;

import com.ApiSpringJpa.Api.Dto.PersonsDto;
import com.ApiSpringJpa.Api.Dto.PersonsResponse;
import com.ApiSpringJpa.Api.Model.Persons;
import com.ApiSpringJpa.Api.Model.Users;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonsMapper {

    private ModelMapper mapper = new ModelMapper();

    public PersonsDto fromModeforDto(Persons persons){
        return mapper.map(persons, PersonsDto.class);
    }

//    public PersonsResponse fromModeforResponse(Persons persons){
//
//        Users users = new Users();
//
//
//        return
//    }

    public List<PersonsDto> fromListModelToListDto(List<Persons> persons){
        return persons.stream().map(persons1 -> fromModeforDto(persons1)).collect(Collectors.toList());
    }
}
