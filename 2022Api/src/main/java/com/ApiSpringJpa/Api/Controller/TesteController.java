package com.ApiSpringJpa.Api.Controller;


import com.ApiSpringJpa.Api.Model.Persons;
import com.ApiSpringJpa.Api.Repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping("/teste")
public class TesteController {

    private final PersonsRepository personrepository;

    @Autowired
    public TesteController(PersonsRepository personrepository){
        this.personrepository = personrepository;
    }

    @GetMapping("/teste")
    public List<Persons> oi(){
        return this.personrepository.findAll();
    }


}
