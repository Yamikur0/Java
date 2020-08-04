/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Administrator
 */
public class CopyFiles {

    public void copy(String in, String out) {
        try {
            FileWriter output;
            try (FileReader input = new FileReader(in)) {
                output = new FileWriter(out);
                int c;
                while ((c = input.read()) != -1) {
                    output.write(c);
                }
            }
            output.close();
        } catch (IOException ioe) {

            System.out.println("Loi" + ioe);
            
        }
    }
}
