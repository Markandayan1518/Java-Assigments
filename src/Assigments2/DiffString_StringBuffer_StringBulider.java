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
public class DiffString_StringBuffer_StringBulider {

    public static void main(String[] args) {
        String str = new String("Hello");
        StringBuilder strBuil = new StringBuilder("Hello");
        StringBuffer strBuff = new StringBuffer("Hello");
        long time;
        {
            time = System.currentTimeMillis();
            for (int i = 0; i < 50000; i++) {
                strBuff.append(i);
            }
            System.out.println("For String Buffer\t:"
                    + Math.abs(time - System.currentTimeMillis()));
        }
        {
            time = System.currentTimeMillis();
            for (int i = 0; i < 50000; i++) {
                str += i;
            }
            System.out.println("For String\t:"
                    + Math.abs(time - System.currentTimeMillis()));
        }
        {
            time = System.currentTimeMillis();
            for (int i = 0; i < 50000; i++) {
                strBuil.append(i);
            }
            System.out.println("For String Builder\t:"
                    + Math.abs(time - System.currentTimeMillis()));
        }

    }
}
