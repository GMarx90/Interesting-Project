package com.marx.galeriaspringboot.reposidory;
import java.sql.Driver;

import com.marx.galeriaspringboot.users.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository <AppUser, Long> {
    AppUser findByUserName(String userName);
}
