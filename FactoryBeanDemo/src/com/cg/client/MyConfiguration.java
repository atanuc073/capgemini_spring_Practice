package com.cg.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.service.CarFactory;
import com.cg.service.CarService;

@Configuration
@ComponentScan("com")
public class MyConfiguration {
	@Bean(name="car1")
	public CarService getCar1() {
		return new CarService();
		
	}
	@Bean(name="car2")
	public CarFactory getCar2() {
		return new CarFactory();
		
	}
	
	

}
