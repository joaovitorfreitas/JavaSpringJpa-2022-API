package com.ApiSpringJpa.Api.Controller;


import com.ApiSpringJpa.Api.Dto.PersonsDto;
import com.ApiSpringJpa.Api.Model.Persons;
import com.ApiSpringJpa.Api.Repository.PersonsRepository;
import com.ApiSpringJpa.Api.Service.PersonsService;
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

    private final PersonsService personservice;

    @Autowired
    public TesteController(PersonsService personservice){
        this.personservice = personservice;
    }

    @GetMapping("/teste")
    public List<PersonsDto> oi(){
        return this.personservice.findAll();
    }


}
