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
public class Bai7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Nhap vao so lan thay xuc xac: ");
            n = input.nextInt();
        } while (n < 0);
        int[] arr = tungXucXac(n);
        xuatMang(arr);
        demSoLanXuatHien(arr);

    }

    public static int[] tungXucXac(int n) {
        int t = 1;
        int b = 7;
        //Khai báo random
        Random rd = new Random();
        //Khai báo mảng
        int[] arr = new int[n];
        //Random giá trị mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(b - t) + t;
        }
        return arr;
    }

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void demSoLanXuatHien(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        //Đếm số lần xuất hiện mặt 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            }
        }
        System.out.printf("%nSo lan xuat hien mat 1: %d%n", count1);
        //Đếm số lần xuất hiện mặt 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                count2++;
            }
        }
        System.out.printf("%nSo lan xuat hien mat 2: %d%n", count2);
        //Đếm số lần xuất hiện mặt 3
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                count3++;
            }
        }
        System.out.printf("%nSo lan xuat hien mat 3: %d%n", count3);
        //Đếm số lần xuất hiện mặt 4
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                count4++;
            }
        }
        System.out.printf("%nSo lan xuat hien mat 4: %d%n", count4);
        //Đếm số lần xuất hiện mặt 5
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                count5++;
            }
        }
        System.out.printf("%nSo lan xuat hien mat 5: %d%n", count5);
        //Đếm số lần xuất hiện mặt 6
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                count6++;
            }
        }
        System.out.printf("%nSo lan xuat hien mat 6: %d%n", count6);
    }
}
