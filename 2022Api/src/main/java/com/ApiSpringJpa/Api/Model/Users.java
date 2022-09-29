package com.ApiSpringJpa.Api.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//User details contem todos esses metodos
public class Users implements UserDetails, GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDUSERS;

    @Column(unique = true)
    private String email;

    private String password;

    private Boolean administrator;

  //  @OneToOne(mappedBy = "users")
    @OneToOne()
    @JoinColumn(name = "IDPERSONS")
    private Persons Persons;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Collection<GrantedAuthority> authorities = new ArrayList<>();

        SimpleGrantedAuthority Option;

        if(administrator.toString().equals("true")){

            Option = new SimpleGrantedAuthority("ROLE_ADMIN");

        }else{
            Option = new SimpleGrantedAuthority("ROLE_USER");
        }

        authorities.add(Option);

        return authorities;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public String getPassword(){
        return this.password;
    }


    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getAuthority() {
        return this.administrator.toString();
    }
}
