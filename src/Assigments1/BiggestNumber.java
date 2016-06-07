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
public class BiggestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Array Size :: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the values for the Array :: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Biggest Number :: " + biggestElementArray(array) );
    }

    private static int biggestElementArray(int[] array) {
        int max = 0;
        int lMax = Integer.MIN_VALUE;
        int rMax = Integer.MIN_VALUE;
        final int mid = array.length/2;
        for (int i = 0; i <= mid; i++) {
             if( lMax < array[i] )
                 lMax = array[i];
             if( rMax < array[mid + i])
                 rMax = array[mid + i];
        }
        if(mid%2 == 0)
            max = max(lMax, rMax);
        else
            max = max(array[mid+1], max(lMax, rMax) );
        
        return max;
    }

    private static int max(int lMax, int rMax) {
        return (lMax > rMax)? lMax : rMax;
    }
    
}
