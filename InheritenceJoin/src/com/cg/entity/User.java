package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="cg_user1")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
	@Id
	private int userid;
	private String uname;
	
	

}
