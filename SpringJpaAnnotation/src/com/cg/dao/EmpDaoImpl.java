package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entity.Dept;
import com.cg.entity.Emp;

@Repository("mydao")
public class EmpDaoImpl implements IEmpDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Emp> viewEmployee() {
		// TODO Auto-generated method stub
		TypedQuery<Emp> qry = em.createQuery("from Emp e inner join fetch e.dept",Emp.class);
		List<Emp> lst = qry.getResultList();
		return lst;
	}

	@Override
	public Emp addEmployee(Emp emp) {
		// TODO Auto-generated method stub
		em.persist(emp);
		return emp;
	}
	@Override
	public Dept getDepartment(String deptName) {
		TypedQuery<Dept> qry = em.createQuery("from Dept where deptName=:dname", Dept.class);
        qry.setParameter("dname", deptName);
        Dept dept =qry.getSingleResult();
        return dept;
	}

	
	

}
