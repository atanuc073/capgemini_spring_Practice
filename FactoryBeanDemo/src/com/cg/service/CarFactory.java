package com.cg.service;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean<CarService>{

	@Override
	public CarService getObject() throws Exception {
		// TODO Auto-generated method stub
		return new CarService();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return CarService.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
