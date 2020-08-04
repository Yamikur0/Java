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
public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so dau : ");
        int top = input.nextInt();//Số đầu của khoảng
        System.out.print("Nhap so cuoi : ");
        int bot = input.nextInt();//Số cuối của khoảng
        Random rd = new Random();//Tạo random
        int num = rd.nextInt(bot - top) + top;//In số ngẫu nhiên giữa 2 số đã nhập
        System.out.printf("So random giua hai so da nhap: %d\n",num);//In số đã random
    }
}
