/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments3;

import java.util.Scanner;

/**
 *
 * @author mark-4304
 */
public class ExactNummber {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the String with Numbers :: ");
        String str = scanner.next();
        
        System.out.println("String Alone :: " + str.replaceAll("[^A-Za-z]", ""));
    }
            
}
