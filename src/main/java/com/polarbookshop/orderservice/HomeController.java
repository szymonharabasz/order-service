package com.polarbookshop.orderservice;

import com.polarbookshop.orderservice.config.PolarProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private final PolarProperties polarProperties;

    public HomeController(PolarProperties polarProperties) {
        this.polarProperties = polarProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        System.out.println("Greeting: " + polarProperties.getGreeting());
        return polarProperties.getGreeting();
    }    
}
