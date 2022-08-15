package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Cake;
import com.example.demo.services.CakeService;

@RestController
@RequestMapping({"/"})
public class CakeController {
    
    private final CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @GetMapping({"cake/{id}"})
    public Cake get(@PathVariable String id) {
        Cake cake = cakeService.findById(Long.valueOf(id));

        return cake;
    }
}
