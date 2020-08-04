/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4;

import static chuong4.SortArr.ConvertInt;
import static chuong4.SortArr.SortIncrease;
import static chuong4.SortArr.SortString;
import static chuong4.WriteReadFile.ReadFile;
import static chuong4.WriteReadFile.WriteFile;

/**
 *
 * @author Admin
 */
public class Bai3_Test {
    public static void main(String[] args) {
       String filePath = "NumText.txt";
        WriteFile(filePath);
        System.out.print("10 so ngau nhien trong file moi tao:\n");
        ReadFile(filePath);
        String[] str = SortString(filePath);
        try {
            System.out.print("Sap xep 10 so trong file theo thu tu tang:\n");
            for (int n : SortIncrease(ConvertInt(str))) {
                System.out.print(n + "  ");
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
