package com.ApiSpringJpa.Api.Service;

import com.ApiSpringJpa.Api.Dto.PersonsDto;
import com.ApiSpringJpa.Api.Dto.PersonsResponse;
import com.ApiSpringJpa.Api.Mapper.PersonsMapper;
import com.ApiSpringJpa.Api.Model.Persons;
import com.ApiSpringJpa.Api.Repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    public PersonsDto FindById(Integer id){
        Persons persons = personsRepository.findById(id).get();

        return personsMapper.fromModeforDto(persons);
    }

    public PersonsDto FindbyCpf(String cpf){
       Persons persons = personsRepository.findByCpf(cpf);

       return personsMapper.fromModeforDto(persons);
    }

    public PersonsDto FindbyName(String name){
        Persons persons = personsRepository.findByName(name);

        return personsMapper.fromModeforDto(persons);
    }

    @Transactional
    public PersonsDto Save(Persons persons){
        return  personsMapper.fromModeforDto(personsRepository.save(persons));
    }

    @Transactional
    public void Remove(Integer id)
    {
        personsRepository.deleteById(id);
    }

    @Transactional
    public PersonsDto Update(Integer Id, Persons persons){

    Persons pers = personsRepository.findById(Id).get();

    pers.setUsers(persons.getUsers());
    pers.setComplement(persons.getComplement());
    pers.setCounty(persons.getCounty());
    pers.setCpf(persons.getCpf());
    pers.setRg(persons.getRg());
    pers.setDistrict(persons.getDistrict());
    pers.setUf(persons.getUf());
    pers.setName(persons.getName());
    pers.setStreet(persons.getStreet());
    pers.setNumberhome(persons.getNumberhome());

    return personsMapper.fromModeforDto(pers);
    }

}
