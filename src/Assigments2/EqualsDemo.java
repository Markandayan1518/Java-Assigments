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
public class EqualsDemo {
    public static void main(String[] args) {
        System.out.println("Mark == Mark  ? "+ ("Mark" == "Mark") );
        System.out.println("Mark == mark  ? "+ ("Mark" == "mark") );
        
        System.out.println("Mark equals Mark  ? "+ ( "Mark".equals("Mark") )  );
        System.out.println("Mark == mark  ? "+ ( "Mark".equals("mark") ) );
        
        System.out.println("4304 == 4304  ? "+ (4304 == 4304) );
        System.out.println("4304 == 4302  ? "+ (4304 == 4302) );
        
        System.out.println("4304 equals 4304  ? "+ ( new Integer("4304").equals(new Integer("4304")) )  );
        System.out.println("4304 == 4302  ? "+ ( new Integer("4304").equals(new Integer("4302")) ) );
        
    }
    
}
