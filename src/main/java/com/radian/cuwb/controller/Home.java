package com.radian.cuwb.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {
    @GetMapping("/api/home")
    public String dadJokes() {
        return "Welcome to Radian CUWB re-write application";
    }
}



