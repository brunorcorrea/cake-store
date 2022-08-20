package com.example.demo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Cake;
import com.example.demo.services.CakeService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping({"/cakes"})
@Slf4j
public class CakeController {
    
    private final CakeService cakeService;

    public CakeController(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @GetMapping({"/{id}"})
    public Cake getCake(@PathVariable String id) {
        Cake cake = cakeService.findById(id);

        return cake;
    }

    @GetMapping({"","/"})
    public List<Cake> getAll() {
        List<Cake> cakes = cakeService.findAll();

        return cakes;
    }

    @PostMapping({"","/"})
    public ResponseEntity<?> create(@RequestBody Cake cake) {
        cakeService.save(cake);

        return ResponseEntity.created(URI.create("/")).body(cake.getName() + " successfully created");
    }
}
