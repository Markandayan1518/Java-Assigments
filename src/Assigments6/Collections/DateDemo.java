package Assigments6.Collections;

import java.time.Instant;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		//Create a Date
		Date currentDate = Date.from(Instant.now());		
		//Print current date		
		System.out.println("Current Date is\t:"+ currentDate +"\n");
		
			
		System.out.println(" 08/06/2016 Date after Current date \t: "+ currentDate.after(new Date(2016, 6, 8)));
		
		System.out.println(" 08/06/2016 Date Before Current date \t: "+ currentDate.before(new Date(2016, 6, 8)));
		
                System.out.println(" 08/06/2016 Date Equals Current date \t: "+ currentDate.equals(new Date(2016, 6, 8)));
		
	}
	
}
