package com.ApiSpringJpa.Api.Service;

import com.ApiSpringJpa.Api.Dto.PersonsDto;
import com.ApiSpringJpa.Api.Mapper.PersonsMapper;
import com.ApiSpringJpa.Api.Model.Persons;
import com.ApiSpringJpa.Api.Repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonsService {

    PersonsMapper personsMapper = new PersonsMapper();

    @Autowired
    PersonsRepository personsRepository;

    public List<PersonsDto> findAll(){
        List<Persons> persons = personsRepository.findAll();

        return personsMapper.fromListModelToListDto(persons);
    }
}
