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
public class NumericValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String with Number :: ");
        String str = scan.nextLine();
        System.out.println("Number in Given String : "+ Integer.parseInt(str) );
    }
}
