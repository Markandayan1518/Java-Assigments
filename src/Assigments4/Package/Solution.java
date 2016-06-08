/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments4.Package;

/**
 *
 * @author mark-4304
 */
public class Solution {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("Markandayan");
        student.setAge(21);
        
        Address address = new Address();
        address.setStreetName("107,Subbrayalu Nagar\n\t\t\t 4th Cross Street");
        address.setCityName("Cuddalore");
        address.setState("Tamil Nadu");
        address.setPinCode(607002);
        
        student.setAddress(address);
        
        student.setCourseFee(25000);
        
        System.out.println(student);
    }
}
