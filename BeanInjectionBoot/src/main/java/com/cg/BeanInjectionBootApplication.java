package com.cg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.service.IService;

@SpringBootApplication
//it minimize the annotations
// it eqivalent to @Configuration + @Componentscan +@EnableAutoConfiguration+@Propertysource
public class BeanInjectionBootApplication implements CommandLineRunner{
// for core implements needs CommandLineRunner
	@Autowired
	// injection of dependency IService
	private IService service;
	public static void main(String[] args) {
		SpringApplication.run(BeanInjectionBootApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// launchs AutoConfigurertool
		System.out.println("main starts");
		System.out.println(service.viewEmployee());
		
	}

}
