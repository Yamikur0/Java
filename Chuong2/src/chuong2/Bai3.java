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
public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = input.nextInt();
        if (n % 2 == 0) {
            int chan = 0;
            for (int i = 2; i <= n; i+=2) {//Số chẵn sẽ cộng từ 2 đến n, bước nhảy là 2
                chan += i;
            }
            System.out.printf("Tong so chan: %d\n",chan);
        } else {//Số chẵn cộng từ 1 đến n, bước nhảy là 2
            int le = 0;
            for (int i = 1; i <= n; i+=2) {
                le += i;
            }
            System.out.printf("Tong so le: %d\n",le);
        }
    }
}
