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
public class InputType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the String :: ");
        String str = scanner.nextLine();
        int lower = 0;
        int upper = 0;
        int number = 0;
        int symbol = 0;
        for (char ch : str.toCharArray() ) {
            
            if ( ch >= 'a' && ch <= 'z' )
                lower++;
            else if ( ch >= 'A' && ch <= 'Z' )
                upper++;
            else if ( ch >= '0' && ch <= '9' )
                number++;
            else
                symbol++;
        }
        
        System.out.println(" Counting of Lower Case : " + lower );
        System.out.println(" Counting of Upper Case : " + upper );
        System.out.println(" Counting of Numbers    : " + number );
        System.out.println(" Counting of Symbols    : " + symbol );
    }
}
