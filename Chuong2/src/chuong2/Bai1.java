/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Nhap vao bang cuu chuong k: ");
        int k = input.nextInt();
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%d*%d= %d\n",k,i,k*i);//In bảng cửu chương đã nhập
        }
        System.out.println("In bang cuu chuong:");
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d*%d= %d\t",j,i,j*i);
            }
            System.out.println();
        }
    }
}
