package com.cg.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mobile")
public class Mobile extends Product{
	private String campx;

	public String getCampx() {
		return campx;
	}

	public void setCampx(String campx) {
		this.campx = campx;
	}
	
	

}
