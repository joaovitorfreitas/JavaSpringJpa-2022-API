package com.ApiSpringJpa.Api.Controller;

import com.ApiSpringJpa.Api.Dto.PersonsDto;
import com.ApiSpringJpa.Api.Dto.PersonsResponse;
import com.ApiSpringJpa.Api.Dto.UsersDto;
import com.ApiSpringJpa.Api.Model.Persons;
import com.ApiSpringJpa.Api.Service.PersonsService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Persons")
public class PersonsController {

    private final PersonsService personsService;

    @Autowired
    private PersonsController(PersonsService personsService){
        this.personsService = personsService;
    }


    @DeleteMapping("/DeletarPerso/{id}")
    public void Deletar(@PathVariable Integer id){
        this.personsService.Remove(id);
    }

    @PostMapping("/CriarPerso")
    public PersonsDto CadastrarPerson(@RequestBody Persons persons){
        return this.personsService.Save(persons);
    }

 //   @PreAuthorize("hasRole('USER')")
    @GetMapping("/ListarPerson")
    public List<PersonsDto> ListarPerson(){
        return this.personsService.findAll();
    }

    @GetMapping("/PegarPessoa/{id}")
    public PersonsDto PegarPessoa(@PathVariable Integer id){
        return this.personsService.FindById(id);
    }

    @GetMapping("/BuscarPessoaNome/{name}")
    public PersonsDto PegarPessoaNome(@PathVariable String name){

        return this.personsService.FindbyName(name);
    }

    @GetMapping("/BuscarPessoaCpf/{cpf}")
    public PersonsDto PegarPessoaCpf(@PathVariable String cpf){

        return this.personsService.FindbyCpf(cpf);
    }

    @PutMapping("/AlterarPessoa/{id}")
    public PersonsDto AlterarPessoa(@PathVariable Integer id, @RequestBody Persons persons){
        return  this.personsService.Update(id, persons);
    }

}
