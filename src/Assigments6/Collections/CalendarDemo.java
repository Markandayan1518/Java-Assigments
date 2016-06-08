package Assigments6.Collections;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		//Create a calendar
		Calendar cal=Calendar.getInstance();		
		//Print current date		
		System.out.println("Current Date is\t:"+cal.getTime()+"\n");
		
		
		//set the date to 1st Jan 1992		
		cal.set(1992, 0, 1);		
		System.out.println("Date after 1st modification\t:"+cal.getTime()+"\n");
		
		
		//Add 3 months		
		cal.add(Calendar.MONTH, 3);
		System.out.println("Date after adding 3 months\t:"+cal.getTime()+"\n");
		
		//Subtract 3 years		
		cal.add(Calendar.YEAR, -3);
		System.out.println("Date after subtracting 3 years\t:"+cal.getTime());
	}
	
	
	
	

}
