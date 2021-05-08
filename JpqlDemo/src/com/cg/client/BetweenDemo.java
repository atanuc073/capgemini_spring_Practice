package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import com.cg.entity.Emp;



public class BetweenDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = emf.createEntityManager();
		String jpql = "from Emp where empSal between :min and :max";
//		Query qry = em.createQuery(jpql);
		TypedQuery<Emp> qry = em.createQuery(jpql,Emp.class);
		qry.setParameter("min", 30000.0);
		qry.setParameter("max", 80000.0);
		List<Emp> elist =qry.getResultList();
		em.close();
		emf.close();
		elist.forEach(System.out :: println);
	}

}
