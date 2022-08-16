package com.example.demo.services;


import com.example.demo.models.Cake;

import java.util.List;

public interface CakeService {
    Cake findById(String id);

    void save(Cake cake);

    List<Cake> findAll();
}
