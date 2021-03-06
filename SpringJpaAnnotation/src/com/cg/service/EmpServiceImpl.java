package com.cg.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.IEmpDao;
import com.cg.dto.EmpDto;
import com.cg.entity.Dept;
import com.cg.entity.Emp;
import com.cg.exceptions.DeptException;
import com.cg.exceptions.EmpIDException;
import com.cg.exceptions.EmpNotFoundException;

@Service("myservice")
@Transactional(readOnly = true)
public class EmpServiceImpl implements IEmpService {
    
	@Autowired
	private IEmpDao dao;

	@Override
	@Transactional(readOnly=false)
	public Integer addEmployee(EmpDto empdto) throws DeptException {
		Emp emp = new Emp();
//		emp.setEmpId(getNextIdForEmployee());
		emp.setEmpName(empdto.getEmpName());
		emp.setEmpSal(empdto.getEmpSal());
		emp.setEmpDoj(empdto.getDoj());
		Dept dept = dao.getDepartment(empdto.getDeptName());
		if (dept == null)
			throw new DeptException("No Department Found");
		emp.setDept(dept);
		Emp persistedEmp = dao.addEmployee(emp);
		return persistedEmp.getEmpId();
	}

	
	@Override
	public List<Emp> viewEmployee() throws EmpNotFoundException {
		List<Emp> lst = dao.viewEmployee();
		if(lst.isEmpty())
			throw new EmpNotFoundException("No Employee Found");
		lst.sort((e1,e2)->e1.getEmpName().compareTo(e2.getEmpName()));
		return lst;
	}
	
	
}
