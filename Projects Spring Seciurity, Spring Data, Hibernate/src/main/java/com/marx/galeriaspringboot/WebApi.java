package com.marx.galeriaspringboot;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Driver;


@RestController
public class WebApi {

    @GetMapping("/admin")
    public String AdminAccess(){
        return "admin";
    }

    @GetMapping("/user")
    public String UserAccess(){
        return "user";
    }

    @GetMapping("/all")
    public String AllAccess(){
        return "all";
    }
}
