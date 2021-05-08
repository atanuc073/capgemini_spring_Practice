package com.cg.clients;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Department;

public class AddDept {
	public static void main(String[] args) {
		EntityManagerFactory fac =Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = fac.createEntityManager();
		EntityTransaction tx =em.getTransaction();
		tx.begin();
			Department d1=new Department();
			d1.setDeptName("hr");
			
			Department d2 = new Department();
			d2.setDeptName("production");
			em.persist(d1);
			em.persist(d2);
		
		tx.commit();
		em.close();
		fac.close();
		System.out.println("table created");
	}

}
