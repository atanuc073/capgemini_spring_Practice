package com.cg.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="cg_dept")
public class Department {
	@Id
	@Column(name="dept_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptId;
	
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Column(name="dept_name",length=25)
	private String deptName;
	
	@Override
	public String toString() {
		return deptId+" "+deptName;
		
	}
	@OneToMany(mappedBy="dept")
	private Set<Emp> employees;
	public Set<Emp> getEmployees(){
		return employees;
		
	}
	
	public void setEmployees(Set<Emp> employees) {
		this.employees =employees;
	}

}
