package com.example.demo;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Demo1Application.class, args);
		
		//Laptop laptop = new Laptop();
		
		Laptop lap = context.getBean(Laptop.class);
		//Laptop lap1 = context.getBean(Laptop.class);
		lap.on();
		
	}

}
