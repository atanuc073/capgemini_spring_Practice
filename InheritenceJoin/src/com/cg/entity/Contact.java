package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cg_contact1")
public class Contact extends User{
	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
