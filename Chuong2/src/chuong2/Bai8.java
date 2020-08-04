/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        int n1 = rd.nextInt(11);
        int n2 = rd.nextInt(11);
        //Tạo mảng chuỗi thông báo đúng sai
        String[] right = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
        String[] wrong = {"No. Please try again.", "Wrong. Try once more.", "Don't give up!", "Wrong. Keep trying."};
        //Hiện ngẫu nhiên phép tính cộng các số trong phạm vi 10
        System.out.printf("%d + %d = ", n1, n2);
        int result = input.nextInt();//Nhập kết quả
        //Xét đúng sai
        if (result == (n1 + n2)) {
            System.out.print(right[rd.nextInt(4)]);//Random các thông báo đúng
        } else {
            System.out.print(wrong[rd.nextInt(4)]);//Random các thông báo sai
        }
    }

}
