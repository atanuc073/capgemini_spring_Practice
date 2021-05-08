package com.cg.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component("jdbcdao")
// eqivalent to bean tag in .xml file
@Repository("jdbcdao")
@Lazy
public class JdbcDao implements IDao{

	public JdbcDao() {
		System.out.println("jdbc dao constructor");
	}
	@Override
	public String getEmployee() {
		
		return "jdbc";
	}

}
