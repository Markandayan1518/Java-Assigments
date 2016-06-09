/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments6;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

/**
 *
 * @author mark-4304
 */
public class WriterDemo {

    public static void main(String[] args) throws IOException {
        Writer writer = new PrintWriter(System.out);

        writer.append("Welcome to ZOHO Crop ");

        writer.flush();

        writer.append("\nHi Markandayan\n\n");

        writer.close();
    }

}
