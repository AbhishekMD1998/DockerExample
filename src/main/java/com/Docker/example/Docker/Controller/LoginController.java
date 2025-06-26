package com.Docker.example.Docker.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {



    @GetMapping("/getName")
    public String getname(){
        return "ABhishek";
    }
}
