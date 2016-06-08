package Assigments6.Collections;

import java.util.ArrayList;

import java.util.List;


public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sachin");
		list.add("Virat");
		list.add("Ashwin");
		list.add(1, "Yuvraj");
		System.out.println("A list of players in a ArrayList");
		
                for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
	}
}
