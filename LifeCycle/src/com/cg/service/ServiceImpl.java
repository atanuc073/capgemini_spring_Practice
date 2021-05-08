package com.cg.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ServiceImpl implements IService,InitializingBean,DisposableBean , BeanNameAware,BeanFactoryAware{
	
	private String msg;
	
	public ServiceImpl() {
		System.out.println("service impl consructor fires");
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("Injecting String Dependency");
	}
	
	@Override
	public String sayHello() {
		return msg;
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("After properties set");
		
	}
	public void init() {
		System.out.println("init");
	}
	public void customDestroy() {
		System.out.println("custom Destroy");
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Bean factory aware");
	}

	@Override
	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("bean Name "+arg0);
		
	}

}
