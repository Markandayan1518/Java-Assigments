/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments6;

import java.io.File;

/**
 *
 * @author mark-4304
 */
public class FileDemo {

    public static void main(String[] args) {
        File file = null;
        String[] paths;
        try {
            file = new File("C:\\Users\\mark-4304\\Documents\\NetBeansProjects\\JavaAssigments");
            paths = file.list();
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
