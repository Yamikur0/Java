/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class SortArr {

    public static String[] SortString(String filePath) {
        String[] lines = new String[10];
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            int j = 0;
            for (int i = 0; i < lines.length; i++) {
                lines[i] = new String();
                for (; line.charAt(j) != ' ' && j < line.length() - 1; j++) {
                    lines[i] += line.charAt(j);
                }
                j++;
            }
        } catch (IOException e) {
            System.out.println("Loi doc file" + e);
        }
        return lines;
    }

    public static int[] ConvertInt(String[] lines) {

        int[] arr = new int[lines.length];
        for (int i = 0; i < lines.length; i++) {
            arr[i] = Integer.parseInt(lines[i]);
        }
        return arr;
    }

    public static int[] SortIncrease(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
