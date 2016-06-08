package Assigments6.Collections;

import java.util.HashMap;

import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(101, "Mark");
		hMap.put(201, "Arun");
		hMap.put(301, "Ajay");
		hMap.put(401, "John");
		hMap.put(501, "Jack");

		System.out.println("Elements of HashMap are" + hMap);
	
		
	}
}