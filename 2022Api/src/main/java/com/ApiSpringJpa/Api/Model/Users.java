package com.ApiSpringJpa.Api.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDUSERS;

    @Column(unique = true)
    private String email;

    private String password;

    private Boolean administrator;

    @OneToOne(mappedBy = "users")
    private Persons Persons;

}
