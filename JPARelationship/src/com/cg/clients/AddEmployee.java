package com.cg.clients;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.entity.Department;
import com.cg.entity.Emp;

public class AddEmployee {
	public static void main(String[] args) {
		EntityManagerFactory fac =Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = fac.createEntityManager();
		EntityTransaction tx =em.getTransaction();
		tx.begin();
		
			Department dept =em.find(Department.class,23);
//			System.out.println("-----------------------"+dept);
			Emp emp = new Emp();
			emp.setEmpName("Naruto");
			emp.setEmpSal(600000.0);
			emp.setEmpdoj(LocalDate.of(2013, 05, 18));
//			LocalDate.of(2017, 07, 15)
			emp.setDept(dept);
			em.persist(emp);

		tx.commit();
		em.close();
		fac.close();
		System.out.println("employee inserted");
		
	}

}
	
