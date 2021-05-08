package com.cg.clients;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cg.beans.Emp;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<Integer,Emp> emap = new HashMap<>();
		emap.put(1003, new Emp(1003,"ram",56000));
		emap.put(1002, new Emp(1002,"tom",46000));
		emap.put(1004, new Emp(1004,"sam",76000));
		emap.put(1002, new Emp(2002,"john",46000));
		emap.put(3002, new Emp(3002,"naresh",26000));
		
		
		System.out.println("-----------------------Iterated using keySet--------------------");
		Set<Integer> keys = emap.keySet();
		for(Integer key : keys) {
			System.out.println(emap.get(key));
		}
		
		System.out.println("---------------iterating using values()------------------");
		Collection<Emp> coll = emap.values();
		for(Emp emp : coll) {
			System.out.println(emp);
		}
		
		System.out.println("---------------- Iterating using entrySet()------------------");
		Set<Entry<Integer , Emp>> entries = emap.entrySet();
		for (Entry entry : entries) {
			System.out.println(entry.getKey()+" " + entry.getValue());
			
		}
		
		
		
	}

}
