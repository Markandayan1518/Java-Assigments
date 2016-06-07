/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments1;

import java.util.Arrays;

/**
 *
 * @author mark-4304
 */
public class StringSorting {

    private static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.print( str + " " );
        }
    }
    
    
    
    public static void main(String[] args) {
       String[] arrstr = {"Mark", "jack", "arun", "Vijay", "surya", "John"};
       
        System.out.println("Before String Sort : ");
        printArray(arrstr);
        
        Arrays.sort(arrstr);
        
        System.out.println("\n\nAfter String Sort : ");
        printArray(arrstr);
        
        
    }
    
}
