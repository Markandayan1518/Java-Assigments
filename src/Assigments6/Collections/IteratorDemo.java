package Assigments6.Collections;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

public class IteratorDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Sachin");
        list.add("Virat");
        list.add("Ashwin");
        list.add(1, "Yuvraj");
        System.out.println("A list of players in a ArrayList");

        Iterator<String> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
