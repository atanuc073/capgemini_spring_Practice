package com.cg.beans;

import java.util.Scanner;

public class Speed {
	private int speed;

	public Speed(int speed) {
		super();
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void m1() throws SpeedException {
		if (getSpeed()<30 || getSpeed()>=90) 
			throw new SpeedException("This is the Speed Exception");
		else
			System.out.println("this is a valid Speed");
			

		
	}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Speed");
		int speed=scan.nextInt();
		Speed obj = new Speed(speed);
		try {
			obj.m1();
		}catch(SpeedException ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Im in final block");
		}
	
	}
	

	

}
