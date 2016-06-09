/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments3;

/**
 *
 * @author mark-4304
 */
public class ScopeDemo {

    static String var = "Global scope";


    public static void main(String[] args) {
        String var = "Local scope";
        System.out.println("Inside Main Methods : " + var);
        functoin1();
        functoin2();
    }

    private static void functoin1() {
        System.out.println("Inside Function 1 :: " + var);
    }
    private static void functoin2() {
        String var = "Functional scope";
        System.out.println("Inside Function 2 :: " + var);
    }
}
