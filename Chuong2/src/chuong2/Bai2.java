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
public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Nhap chuoi : ");//Nhập chuỗi
        String myStr = input.nextLine(); 
        myStr = myStr.toUpperCase();//Viết hoa chuỗi
        System.out.print("Chuoi viet tat: ");
        System.out.print(myStr.charAt(0));//In ký tự tại vị trí đầu chuỗi     
        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i)== 32) {  
                System.out.print(myStr.charAt(i+1));//In ký tự sau khoảng trắng
            }
        }
    }
}
