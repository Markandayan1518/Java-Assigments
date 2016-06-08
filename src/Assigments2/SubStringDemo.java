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
public class SubStringDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :: ");
        String str = scan.nextLine();
        
        System.out.println("Enter the Begin Index : ");
        int beginIndex = scan.nextInt();
        
        System.out.println("Enter the End Index   : ");
        int endIndex = scan.nextInt();
        
        System.out.println("Exceted SubString is : " + str.substring(beginIndex, endIndex));
    }
}
