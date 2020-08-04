/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4.Bai4;

import static chuong4_bai4.ReplaceText.ReadOldString;
import static chuong4_bai4.ReplaceText.Replace;

/**
 *
 * @author Admin
 */
public class NewClass {
    public static void main(String[] args) {
        String file = "D:\\Java\\Chuong4\\src\\chuong4\\Bai4\\sourceFile.txt";
        String destFile = "destFile.txt";
        ReadOldString(file);
        Replace(file, destFile);
    }
}
