/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mark-4304
 */
public class SystemProperties {

    private static void dumpVars(Map<String, ?> m) {
        List<String> keys = new ArrayList<String>(m.keySet());
        Collections.sort(keys);
        for (String k : keys) {
            System.out.println(k + " : " + m.get(k));
        }
    }

    public static void main(String[] args) {
        System.out.println("===== ENV VARIABLES =====");
        dumpVars(System.getenv());

        System.out.println("===== PROPERTIES =====");
        dumpVars(new HashMap(System.getProperties()));
    }

}
