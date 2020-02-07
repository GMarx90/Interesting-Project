package com.marx.galeriaspringboot;
import java.sql.Driver;

import com.marx.galeriaspringboot.reposidory.AppUserRepository;
import com.marx.galeriaspringboot.users.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private AppUserRepository appUserRepository;

    @Autowired
    public UserDetailsServiceImpl(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return appUserRepository.findByUserName(s);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void get(){
        AppUser appUser=new AppUser("jan","Nowwak","USER");
        appUserRepository.save(appUser);
    }
}
