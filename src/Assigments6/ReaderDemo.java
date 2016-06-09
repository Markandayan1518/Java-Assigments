/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigments6;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 *
 * @author mark-4304
 */
public class ReaderDemo {

    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("Desktop & Central");

        for (int i = 0; i < 7; i++) {
            System.out.print((char) reader.read());
        }

        //skiping ' & ' in the string
        reader.skip(3);

        char[] charArray = new char[7];

        reader.read(charArray, 0, 7);

        System.out.println(charArray);

        reader.close();
    }
}
