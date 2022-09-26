package com.ApiSpringJpa.Api.Service;

import com.ApiSpringJpa.Api.Dto.PersonsDto;
import com.ApiSpringJpa.Api.Dto.UsersDto;
import com.ApiSpringJpa.Api.Mapper.PersonsMapper;
import com.ApiSpringJpa.Api.Mapper.UsersMapper;
import com.ApiSpringJpa.Api.Model.Persons;
import com.ApiSpringJpa.Api.Model.Users;
import com.ApiSpringJpa.Api.Repository.PersonsRepository;
import com.ApiSpringJpa.Api.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsersService {

    UsersMapper usersMapper = new UsersMapper();

    @Autowired
    UsersRepository usersRepository;

    public List<UsersDto> findAll(){
        List<Users> users = usersRepository.findAll();

        return usersMapper.fromListModelToListDto(users);
    }

    public UsersDto FindById(Integer id){
        Users users = usersRepository.findById(id).get();

        return usersMapper.fromModeforDto(users);
    }

    @Transactional
    public UsersDto Save(Users users){
        return  usersMapper.fromModeforDto(usersRepository.save(users));
    }


    @Transactional
    public void Remove (Integer id){
        usersRepository.deleteById(id);
    }
}
