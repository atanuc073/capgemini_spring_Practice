package com.cg.client;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.cg.entity.Emp;

public class AggregationDemo {

	public static void main(String[] args) {
		List<String> lst =Arrays.asList("hr","production");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em =emf.createEntityManager();
		String jpql = "select sum(empSal),avg(empSal) from Emp";
		TypedQuery<Object[]> qry = em.createQuery(jpql,Object[].class);
		Object[] arr = qry.getSingleResult();
		em.close();
		emf.close();
		System.out.println("Sum -> "+arr[0]);
		System.out.println("Average -> "+arr[1]);
	}
	

}
