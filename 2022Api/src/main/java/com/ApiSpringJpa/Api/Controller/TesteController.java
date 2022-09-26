package com.ApiSpringJpa.Api.Controller;


import com.ApiSpringJpa.Api.Dto.PersonsDto;
import com.ApiSpringJpa.Api.Dto.UsersDto;
import com.ApiSpringJpa.Api.Model.Persons;
import com.ApiSpringJpa.Api.Model.Users;
import com.ApiSpringJpa.Api.Repository.PersonsRepository;
import com.ApiSpringJpa.Api.Repository.UsersRepository;
import com.ApiSpringJpa.Api.Service.PersonsService;
import com.ApiSpringJpa.Api.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/teste")
public class TesteController {

    private final UsersService usersservice;

    @Autowired
    public TesteController(UsersService usersservice, UsersRepository userrepository){
        this.usersservice = usersservice;
    }
    @PostMapping("/criarnovo")
    public UsersDto CriarNovo(@RequestBody  Users users){

        return this.usersservice.Save(users);
    }

    @GetMapping("/ListarNovo")
    public List<UsersDto> Listar(){
        return this.usersservice.findAll();
    }

    @DeleteMapping("/RemoverUsuario/{id}")
    public void DeletarUsuario(@PathVariable Integer id){
        usersservice.Remove(id);
    }





}
