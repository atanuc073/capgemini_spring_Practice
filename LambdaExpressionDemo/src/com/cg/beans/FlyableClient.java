package com.cg.beans;

public class FlyableClient {
	
	public static void main(String[] args) {
		display(()-> System.out.println("Eagle"));
		display(()-> System.out.println("Sparrow"));
		display(()->System.out.println("Flight"));
	}
	
	public static void display(Flyable obj) {
		System.out.println(obj.getClass().getName());
		obj.fly();
	}

}
