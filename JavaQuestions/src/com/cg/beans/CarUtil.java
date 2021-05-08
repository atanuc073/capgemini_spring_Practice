package com.cg.beans;

import java.util.ArrayList;
import java.util.List;

public class CarUtil {
	
	public static List<Car> getCars(){
		List<Car> carlst=new ArrayList<>();
		carlst.add(new Car(1001,"BMW",5600000));
		carlst.add(new Car(1002,"HONDA",600000));
		carlst.add(new Car(1003,"RANGE ROVER",6100000));
		carlst.add(new Car(1004,"PORSHE",7500000));
		carlst.add(new Car(1005,"JAGUAR",5500000));
		carlst.add(new Car(1006,"TOYOTA",2000000));
		return carlst;
		
		
	}
	
	public static void display(Car car) {
		System.out.println("Car Id :"+car.getCarId());
		System.out.println("Car Name :"+car.getCarName());
		System.out.println("Car Price :"+car.getPrice());
		
		
	}

}
