package com.ApiSpringJpa.Api.Repository;

import com.ApiSpringJpa.Api.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
