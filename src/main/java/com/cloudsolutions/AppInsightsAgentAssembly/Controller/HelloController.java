package com.cloudsolutions.AppInsightsAgentAssembly.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//THe hello world controller
@RequestMapping("/api")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Get(){
        return "Hello World, Spring Boot!";
    }
}
