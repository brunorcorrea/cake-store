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

		Cake cake =Cake.from("Chocolate cake");
		Cake cake2 =Cake.from("Strawberry cake");
		Cake cake3 =Cake.from("Simple cake");
		
		cakeService.save(cake);
		cakeService.save(cake2);
		cakeService.save(cake3);
	}

}
