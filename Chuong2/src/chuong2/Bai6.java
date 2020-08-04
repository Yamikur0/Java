/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so thap phan: ");
        int n = input.nextInt();
        String myStr = "";
        System.out.println("So La Ma tuong ung la: " + SoSangLaMa(myStr, n));
    }
    //Hàm đổi từ số sang số La Mã
    public static String SoSangLaMa(String myStr,int n){
            while (n >= 1000) {
            myStr += "M";
            n -= 1000;
        }
        while (n >= 900) {
            myStr += "CM";
            n -= 900;
        }
        while (n >= 500) {
            myStr += "D";
            n -= 500;
        }
        while (n >= 400) {
            myStr += "CD";
            n -= 400;
        }
        while (n >= 100) {
            myStr += "C";
            n -= 100;
        }
        while (n >= 90) {
            myStr += "XC";
            n -= 90;
        }
        while (n >= 50) {
            myStr += "L";
            n -= 50;
        }
        while (n >= 40) {
            myStr += "XL";
            n -= 40;
        }
        while (n >= 10) {
            myStr += "X";
            n -= 10;
        }
        while (n >= 9) {
            myStr += "IX";
            n -= 9;
        }
        while (n >= 5) {
            myStr += "V";
            n -= 5;
        }
        while (n >= 4) {
            myStr += "IV";
            n -= 4;
        }
        while (n >= 1) {
            myStr += "I";
            n -= 1;
        }
        return myStr;
    }
}
