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
public class FindAndReplace {
     final static private String line = "Active Directory (AD) is a directory service that Microsoft developed for Windows domain networks. It is included in most Windows Server operating systems as a set of processes and services.[1][2] Initially, Active Directory was only in charge of centralized domain management. Starting with Windows Server 2008, however, Active Directory became an umbrella title for a broad range of directory-based identity-related services";
    
    public static void main(String[] args) {
        String findString = "Active";
        String replaceString = "Passive";
        
        System.out.println("Before Find And Replace");
        System.out.println(line);
        
         String resultedLine = line.replaceAll(findString, replaceString);
        
        System.out.println("After Find And Replace");
        System.out.println(resultedLine);
        
    }
}
