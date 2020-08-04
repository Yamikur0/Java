/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong3;

/**
 *
 * @author Admin
 */
public class Bai2 {
    public static void main(String[] args) {
        try {
            int a = 8;
            int b = 0;
            int c = a / b;

            System.out.println(c);
        } catch (ArithmeticException ae) { //Lỗi nếu mẫu chia cho 0
            System.out.println("loi chia cho 0: " + ae);
        }
    }
}
