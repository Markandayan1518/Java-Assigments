/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments2;

/**
 *
 * @author mark-4304
 */
public class StaticMethod {
    
    private static class Calculator {

        private static int add(int a, int b) {
            return a + b;
        }

        private static int mul(int a, int b) {
            return a * b;
        }

    }

    public static void main(String args[]) {
        System.out.println("********Using Class name********\n");
        int sum = Calculator.add(12, 34);
        System.out.println("Result of Addition: " + sum);
        int mul = Calculator.mul(12, 34);
        System.out.println("Result of Multiplication : " + mul);
        System.out.println("\n\n");

        // Invoking static method through reference
        System.out.println("********Using Reference variable********");
        Calculator calculator = null;
        int sum1 = calculator.add(12, 34);
        System.out.println("Result of Addition: " + sum1);
        int mul1 = calculator.mul(12, 34);
        System.out.println("Result of Multiplication : " + mul1);
        System.out.println("\n\n");
        // Invoking static method through object
        System.out.println("********Using object********");
        Calculator calculator1 = new Calculator();
        int sum2 = calculator1.add(12, 34);
        System.out.println("Result of Addition: " + sum2);
        int mul2 = calculator.mul(12, 34);
        System.out.println("Result of Multiplication : " + mul2);
        System.out.println("\n\n");
    }

    
}
