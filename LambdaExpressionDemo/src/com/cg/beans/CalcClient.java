package com.cg.beans;

public class CalcClient {
	public static void main(String[] args) {
		display((a,b)->{return a+b;},10,5);
		display((a,b)->{return a-b;},10,5);
		display((a,b)->{return a*b;},10,5);
		display((a,b)->{return a/b;},10,5);
	}
	
	public static void display(Icalc obj,int a,int b) {
		System.out.println(obj.doCalc(a, b));
	}

}
