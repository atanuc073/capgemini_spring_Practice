package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ProjectionDemo {
	public static void main(String[] args) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
			EntityManager em =emf.createEntityManager();
			String jpql = "select empName,empSal,empDept from Emp where empSal>:sal";
			TypedQuery<Object[]> qry =em.createQuery(jpql,Object[].class);
			qry.setParameter("sal", 35000.0);
			List<Object[]> results =qry.getResultList();
			em.close();
			emf.close();
			for(Object[] arr : results) {
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			}
	
	}
}
