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
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the String :: ");
        String str = scanner.nextLine();
        
        System.out.println("Is Given String Palindrome ?  - " + isPalindrome(str) );
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i <= str.length()/2; i++) {
            char left = str.charAt(i);
            char right = str.charAt(str.length() - 1 - i);
            if( left != right )
                return false;
            
        }
        return true;
    }
}
