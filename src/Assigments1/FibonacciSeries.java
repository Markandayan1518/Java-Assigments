/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments1;

import java.util.Scanner;

/**
 *
 * @author mark-4304
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Range :: ");
        int range = scanner.nextInt();
        
        int first = 0;
        int second = 1;
        
        if ( range >= 1 )
            System.out.println(first);
        
        if ( range >= 2 )
            System.out.println(second);
        
        range -= 2; 
        
        while ( range > 0 ){
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
            range--;
        }
    }

}
