package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

//import com.cg.entity.Computer;
import com.cg.entity.Contact;
//import com.cg.entity.Mobile;

public class Client {
	EntityManagerFactory fac =Persistence.createEntityManagerFactory("JPA-CRUD");
	EntityManager em =fac.createEntityManager();
	EntityTransaction tx =em.getTransaction();
	tx.begin();
	Contact obj1 = new Contact();
	obj1.setStreet("hello");
//	obj1.setPname("Acer");
//	obj1.setHdd("4tb");
	em.persist(obj1);
	
	Mobile obj2 =new Mobile();
	obj2.setPid(2);
	obj2.setPname("Samsung");
	obj2.setCampx("15");
	em.persist(obj2);
	tx.commit();
	
	em.close();
	fac.close();
	System.out.println("Table Created");

}
