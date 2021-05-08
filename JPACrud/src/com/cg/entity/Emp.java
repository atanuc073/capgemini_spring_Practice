package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.validator.internal.constraintvalidators.bv.notempty.NotEmptyValidatorForArraysOfDouble;

@Entity
@Table(name = "cg_emp2")
public class Emp {

	@Id
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "emp_name", length = 25, nullable = false) // default length is 255
	private String empName;
	@Column(name = "emp_sal")
	private Double empSal;
	@Column(name = "emp_dept", length = 20) // default length is 255
	private String empDept;
	@Column(name = "emp_doj")
	private LocalDate empDoj;


	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public LocalDate getempDoj() {
		return empDoj;
	}

	public void setempDoj(LocalDate empDoj) {
		this.empDoj = empDoj;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + " " + empName + " " + empSal + " " + empDept + " " + empDoj;
	}
	
	
}
