package com.nagarro.dockerapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @RequestMapping("/")
    public String home() {
        return "Docker Spring App is started successfully";
    }
}
