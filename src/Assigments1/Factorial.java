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
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number :: ");
        int number = scanner.nextInt();
        
        System.out.println("Factorial of given Number : " + factorial(number) );
    }


    private static int factorial(int number) {
        int fact;
        for ( fact = 1; number > 0; number--)
             fact *= number;
        return fact;
    }
}
