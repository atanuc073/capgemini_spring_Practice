package com.cg.client;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AddEmployee {
	public static void main(String[] args) {
	
	EntityManagerFactory fac = Persistence.createEntityManagerFactory("JPA-CRUD");
	
	fac.close();
	System.out.println("table created");
	}
}

