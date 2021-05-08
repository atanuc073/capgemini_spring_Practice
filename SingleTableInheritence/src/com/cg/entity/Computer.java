package com.cg.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//import com.fasterxml.jackson.core.sym.Name;

@Entity
@DiscriminatorValue("Computer")
public class Computer extends Product{
	private String hdd;

	public String getHdd() {
		return hdd;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	
	
	
}
