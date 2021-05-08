package com.cg.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.IService;

public class ClientA {
	static AbstractApplicationContext ctx =new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		IService ser =ctx.getBean("myser",IService.class);
		System.out.println(ser.sayHello());
		System.out.println("demand for two time");
		IService ser2 = ctx.getBean("myser",IService.class);
		System.out.println(ser.sayHello());
		ctx.registerShutdownHook();
		
	}

}
