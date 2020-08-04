/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 256; i++) {//Lặp từ 1 đến 256
            System.out.printf("%d\t", i);//Decimal
            System.out.printf("%s\t",Integer.toOctalString(i));//Octal
            System.out.printf("%s\t",Integer.toHexString(i).toUpperCase());//Hex
            System.out.printf("%s\t",Integer.toBinaryString(i));//Binary
            System.out.printf("\n");
        }
    }
}