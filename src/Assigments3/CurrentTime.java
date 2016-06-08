/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments3;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author mark-4304
 */
public class CurrentTime {
    public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
                LocalTime currentTime = LocalTime.now();
		System.out.println("Current Date  : " + currentDate );
                System.out.println("Current Time  : " + currentTime ); 
		
	}
}


