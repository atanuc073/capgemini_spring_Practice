package com.cg.main;

import java.util.Scanner;

import com.cg.exception.SpeedInvalidException;

public class Vehicle {
	private int speed;
	public Vehicle(int speed) throws SpeedInvalidException {
		if(speed>=30 && speed<=90) {
			this.speed=speed;
			System.out.println("Valid Speed");
		}
		else
			throw new SpeedInvalidException("SpeedInvalidException");
		

	}
	
	public void setSpeed(int sp) throws SpeedInvalidException {
		if(sp>=30 && sp<=90) {
			this.speed=speed;
			System.out.println("Valid Speed");
		}
		else 
			throw new SpeedInvalidException("SpeedInvalidException");
//		System.out.println("this is a exception");
	}
	
	public static void main(String[] args) throws SpeedInvalidException {
		try {
		int speed;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the speed :");
		speed=scan.nextInt();
		Vehicle car = new Vehicle(speed);
		System.out.println("Enter the updated speed :");
		speed=scan.nextInt();
		car.setSpeed(speed);

		}catch(SpeedInvalidException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("hello world");
	}

}
