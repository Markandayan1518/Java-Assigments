/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments3;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author mark-4304
 */
public class ChecksDate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dd,mm,yyyy;
        
        System.out.println("Enter the day, Month, year :: ");
        dd = scan.nextInt();
        mm = scan.nextInt();
        yyyy = scan.nextInt();
        
        LocalDate currentdate = LocalDate.now();
        LocalDate givenDate = LocalDate.of(yyyy, mm, dd);
        
        System.out.println("Is After the Current Date : " + givenDate.isAfter(currentdate) );
        System.out.println("Is Before the Current Date : " + givenDate.isBefore(currentdate) );
        System.out.println("Is Equal the Current Date : " + givenDate.isEqual(currentdate) );
    }
}
