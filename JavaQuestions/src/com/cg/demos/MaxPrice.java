package com.cg.demos;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.cg.beans.Car;
import com.cg.beans.CarUtil;

public class MaxPrice {
	
	public static void main(String[] args) {
		
		List<Car> lst = CarUtil.getCars();
		
		double max = lst.stream().mapToDouble(e->e.getPrice()).max().getAsDouble();
		System.out.println("The max Price of all the cars : "+max);
		
		System.out.println("CarNames whose price is above 2000000");
		List<String> lst1 = lst.stream().filter(e->e.getPrice()>2000000).map(e->e.getCarName()).collect(Collectors.toList());
		System.out.println(lst1);
		
		double sum = lst.stream().mapToDouble(e->e.getPrice()).sum();
		System.out.println("The Total price of cars is :"+sum);
		
		
	}

}
