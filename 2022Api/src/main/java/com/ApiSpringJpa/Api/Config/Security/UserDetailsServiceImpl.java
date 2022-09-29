package com.ApiSpringJpa.Api.Config.Security;

import com.ApiSpringJpa.Api.Model.Users;
import com.ApiSpringJpa.Api.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = usersRepository.findByEmail
                (username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new User(users.getUsername(), users.getPassword(), true,true,true,true, users.getAuthorities());
    }
}
