package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Dept;

@Repository
public interface IDeptDao extends JpaRepository<Dept, Integer>{
//methods in JpaRepository create implementation at Runtime.
	public Dept findByDeptName(String deptname);
	// it check deptName is a field in Dept class
	
}
