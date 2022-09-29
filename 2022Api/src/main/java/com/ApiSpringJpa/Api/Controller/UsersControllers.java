package com.ApiSpringJpa.Api.Controller;

import com.ApiSpringJpa.Api.Dto.UsersDto;
import com.ApiSpringJpa.Api.Model.Users;
import com.ApiSpringJpa.Api.Service.UsersService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Users")
public class UsersControllers {

    private final UsersService usersService;

    @Autowired
    private UsersControllers(UsersService usersService){
        this.usersService = usersService;
    }


    @PostMapping("/criarnovo")
    public UsersDto CriarNovo(@RequestBody Users users){

        return this.usersService.Save(users);
    }

    // @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/ListarNovo")
    public List<UsersDto> Listar(){
        return this.usersService.findAll();
    }

    @DeleteMapping("/RemoverUsuario/{id}")
    public void DeletarUsuario(@PathVariable Integer id){
        usersService.Remove(id);
    }

    @GetMapping("/PegarUsuario/{id}")
    public UsersDto PegarUsuario(@PathVariable Integer id){
        return this.usersService.FindById(id);
    }
}
