package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.service.CarFactory;
import com.cg.service.CarService;

public class ClientB {
	// loads beans.xml from class path and configure all the instance
		static ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
		public static void main(String[] args) {
			System.out.println("main starts");
			CarService ser = ctx.getBean("car1", CarService.class);
			ser.drive();
			CarService ser1 = ctx.getBean("car2", CarService.class);
//			ser1.getClass();
			ser1.drive();
		}

}
