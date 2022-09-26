package com.ApiSpringJpa.Api.Dto;

import com.ApiSpringJpa.Api.Model.Persons;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {

    private Integer IDUSERS;

    private String email;

    private String password;

    private Boolean administrator;

    private Persons Persons;
}
