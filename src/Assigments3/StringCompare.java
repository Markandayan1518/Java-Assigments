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
public class StringCompare {

    public static void main(String[] args) {
        String str1 = "Mark";
        String str2 = "marK";
        System.out.println("stricmp(" + str1 + ", " + str2 + ") :: " + stricmp(str1, str2));

        str1 = "ZoHO";
        str2 = "zoHO";
        System.out.println("stricmp(" + str1 + ", " + str2 + ") :: " + stricmp(str1, str2));
        
        str1 = "ZoHOCrop";
        str2 = "zoHO";
        System.out.println("stricmp(" + str1 + ", " + str2 + ") :: " + stricmp(str1, str2));
        
        str1 = "Markandayan";
        str2 = "M@rk@nd@y@n";
        System.out.println("stricmp(" + str1 + ", " + str2 + ") :: " + stricmp(str1, str2));
        
    }

    private static boolean stricmp(String str1, String str2) {
        return str1.equalsIgnoreCase(str2) ;
    }

}
