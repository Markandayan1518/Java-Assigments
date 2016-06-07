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
public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the String :: ");
        String str = scanner.nextLine();
        
        System.out.println("Length of the String :: " + str.toCharArray().length);
    }
}
