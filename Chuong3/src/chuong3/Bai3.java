/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean flag;
            int ts = 0;
            int ms = 0;
            int kq = 0;
           
            do {
                try {
                    System.out.print("Nhap tu so: ");               
                    ts = Integer.valueOf(input.nextLine());//Chuyển đổi chuỗi sang số
                    flag = true;//True chạy tiếp chương trình
                } catch (NumberFormatException nfe) { //Lỗi nếu nhập chữ
                    System.out.println("Loi nhap chu! Xin nhap lai so");
                    flag = false;
                }
            } while (flag == false); //Nếu false thì người dùng nhập lại
            
            do {
                try {
                    System.out.print("Nhap mau so: ");
                    ms = Integer.parseInt(input.nextLine());//Chuyển đổi chuỗi sang số
                    kq = ts / ms;
                    flag = true;//True chạy tiếp chương trình
                } catch (NumberFormatException nfe) { //Lỗi nếu nhập chữ
                    System.out.println("Loi nhap chu! Xin nhap lai so");
                    flag = false;
                } catch (ArithmeticException ae) { //Lỗi nếu chia mẫu cho 0
                    System.out.println("Loi chia cho 0! Xin nhap lai");
                    flag = false;
                }
            } while (flag == false); //Nếu false thì người dùng nhập lại
            System.out.printf("%d/%d = %d%n", ts, ms, kq);
            input.close();
        }

    }
}
