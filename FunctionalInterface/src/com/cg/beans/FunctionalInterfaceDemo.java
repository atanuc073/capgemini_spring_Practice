package com.cg.beans;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		Consumer<String> obj1 =(str1)->System.out.println("Hello "+str1);
		obj1.accept("ram");
		Predicate<String> obj2 =(str1)->str1.length()>=3;
		System.out.println(obj2.test("ram Kumar"));
		Function<Integer,Double> obj3 =(n)->Math.pow(n,2);
		System.out.println(obj3.apply(5));
		Supplier<String>obj4=()->{return "hello";};
		System.out.println(obj4.get());
	
	}

}
