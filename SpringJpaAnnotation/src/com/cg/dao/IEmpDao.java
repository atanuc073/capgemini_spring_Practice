package com.cg.dao;

import java.util.List;

import com.cg.entity.Dept;
import com.cg.entity.Emp;

public interface IEmpDao {
	public List<Emp> viewEmployee();
	public Emp addEmployee(Emp emp);
	public Dept getDepartment(String deptName);
}
