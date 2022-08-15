package com.example.demo.services;


import com.example.demo.models.Cake;

public interface CakeService {
    public Cake findById(Long id);

    public void save(Cake cake);
}
