package com.cg.service;

public class CurrencyServiceImpl implements ICurrencyService{
	
	private String msg;
	private double rate;
	
	public void setMsg(String msg) {
		this.msg=msg;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public double convertToINR(double usd) {
		// TODO Auto-generated method stub
		return rate*usd;
	}

	@Override
	public String currentState() {
		// TODO Auto-generated method stub
		return msg+" current rate id " + rate;
	}
	

}
