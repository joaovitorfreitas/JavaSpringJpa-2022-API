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
public class Persons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDPERSONS;

    @Column(unique = true)
    private String cpf;

    private String name;

    private String street;

    private Integer numberhome;

    private String district;

    private String complement;

    private String county;

    private String uf;

    private String rg;

    //@OneToOne
    //@JoinColumn(name = "IDUSERS")
    @OneToOne(mappedBy = "Persons")
    private Users users;
}
