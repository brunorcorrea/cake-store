package com.example.demo.bootstrap;

import com.example.demo.models.Cake;
import com.example.demo.services.CakeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    CakeService cakeService;

    public DataLoader(CakeService cakeService) {
        this.cakeService = cakeService;
    }

    @Override
    public void run(String... args) throws Exception {

		Cake cake1 = Cake.from("Chocolate cake");
		Cake cake2 = Cake.from("Strawberry cake");
		Cake cake3 = Cake.from("Simple cake");

        cakeService.save(cake1);
        cakeService.save(cake2);
        cakeService.save(cake3);
    }
}
