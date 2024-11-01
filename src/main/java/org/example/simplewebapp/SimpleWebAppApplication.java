package org.example.simplewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@RequestMapping("/")
public class SimpleWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebAppApplication.class, args);
    }

    @RequestMapping("/foundation")
    public String foundation(){
        return "foundation";
    }
}

