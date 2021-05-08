package com.cg.beans;

public class Car {
	private int carId;
	private String carName;
	private float price;
	
	public Car(int carId,String carName,float price) {
		this.carId=carId;
		this.carName=carName;
		this.price=price;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	

}
