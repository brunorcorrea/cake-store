package com.example.demo.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.Cake;
import com.example.demo.repositories.CakeRepository;

@Service
public class CakeServiceImpl implements CakeService{
    private final CakeRepository cakeRepository;
    
    public CakeServiceImpl(CakeRepository cakeRepository) {
        this.cakeRepository = cakeRepository;
    }

    @Override
    public Cake findById(Long id) {
        Optional<Cake> cake = cakeRepository.findById(id);

        return cake.get();
    }

    public void save(Cake cake) {
        cakeRepository.save(cake);
    }
}
