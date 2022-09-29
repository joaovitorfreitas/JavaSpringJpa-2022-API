package com.ApiSpringJpa.Api.Repository;

import com.ApiSpringJpa.Api.Model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonsRepository extends JpaRepository<Persons, Integer> {

    public Persons findByCpf(String cpf);

    public Persons findByName(String name);

}
