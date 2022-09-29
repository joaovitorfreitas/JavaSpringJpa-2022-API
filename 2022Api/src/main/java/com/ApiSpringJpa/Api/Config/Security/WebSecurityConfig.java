package com.ApiSpringJpa.Api.Config.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


//Jeito antigo de se aplicar
// @EnableWebSecurity = desligando todas config default do WebSecurity
// extends WebSecurityConfigurerAdapter foi descontinuada,

//@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    final
//    UserDetailsServiceImpl userDetailsService;
//
//    public WebSecurityConfig(UserDetailsServiceImpl userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//
//    //  Solicitações http
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.
//                httpBasic()
//                .and()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/Users/ListarNovo").hasRole("USER")
//                .antMatchers(HttpMethod.GET, "/Persons/ListarPerson").hasRole("ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .csrf()
//                .disable();
//
//        //Desabilita o crsf .and()
//        //                  .csrf()
//        //                  .disable();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//       // passando configuração feitas na classe
//       auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    // Cria uma criptografia para o password, que é requerida para autenticação do mesmo
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }

}

