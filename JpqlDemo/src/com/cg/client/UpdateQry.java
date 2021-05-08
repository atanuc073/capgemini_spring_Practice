package com.cg.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.cg.entity.Emp;

public class UpdateQry {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em =emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		String jpql = "update Emp set empSal=:sal where empId=:eid";
		Query qry =em.createQuery(jpql);
		qry.setParameter("sal", 800000.0);
		qry.setParameter("eid", 34);
		int rows =qry.executeUpdate();
//		List<Emp> results =qry.getResultList();
		tx.commit();
		em.close();
		emf.close();
		System.out.println(rows);
	}


}
