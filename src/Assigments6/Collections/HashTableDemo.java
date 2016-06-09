package Assigments6.Collections;


import java.util.Enumeration;
import java.util.Hashtable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mark-4304
 */
public class HashTableDemo {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        // Creating a Hashtable
        Hashtable<String, String> hashtable
                = new Hashtable<String, String>();

        // Adding Key and Value pairs to Hashtable
        hashtable.put("4304", "Markandayan");
        hashtable.put("1232", "Ajay");
        hashtable.put("4335", "Peter");
        hashtable.put("4333", "Raj");
        hashtable.put("6545", "Jack");

        names = hashtable.keys();
        while (names.hasMoreElements()) {
            key = (String) names.nextElement();
            System.out.println("Key: " + key + "     ----    Value: "
                    + hashtable.get(key));
        }
    }
}
