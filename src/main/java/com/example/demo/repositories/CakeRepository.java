package com.example.demo.repositories;

import org.springframework.stereotype.Repository;

import com.example.demo.models.Cake;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface CakeRepository extends CrudRepository<Cake, Long> {
    
}
