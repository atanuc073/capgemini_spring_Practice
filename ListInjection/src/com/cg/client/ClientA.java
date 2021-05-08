package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientA {
	
	static ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

}
