package com.marx.galeriaspringboot.users;

import com.marx.galeriaspringboot.UserDetailsServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collection.*;
import static java.util.Collections.singleton;
import java.sql.Driver;


@Getter @Setter
@NoArgsConstructor
@Entity
public class AppUser implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String userName;
    private String userPassword;
    private String role;

    public AppUser(String  userName, String userPassword, String role) {
        this.userName=userName;
        this.userPassword=userPassword;
        this.role=role;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(role));}

    @Override
    public String getPassword() {
        return userPassword;
    }

    @Override
    public String getUsername() {
        return null;
    }
/*
    @Override
    public String userName() {
        return userName;
    }*/

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
        return false;
    }
}
