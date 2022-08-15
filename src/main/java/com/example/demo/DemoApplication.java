package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.models.Cake;
import com.example.demo.services.CakeService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		CakeService cakeService = ctx.getBean(CakeService.class);

		Cake cake = new Cake(1L, "Chocolate cake");
		Cake cake2 = new Cake(2L, "Strawberry cake");
		Cake cake3 = new Cake(3L, "Simple cake");
		
		cakeService.save(cake);
		cakeService.save(cake2);
		cakeService.save(cake3);
	}

}
