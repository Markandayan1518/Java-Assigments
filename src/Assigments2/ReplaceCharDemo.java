/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments2;

import java.util.Scanner;

/**
 *
 * @author mark-4304
 */
public class ReplaceCharDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :: ");
        String str = scan.nextLine();
        
        System.out.println("Enter the Old Char : ");
        char oldChar =  scan.next().charAt(0);
        
        System.out.println("Enter the New Char : ");
        char newChar =  scan.next().charAt(0);
             
        System.out.println("Exceted Replaced String is : " + str.replace(oldChar, newChar) );
    }
}
