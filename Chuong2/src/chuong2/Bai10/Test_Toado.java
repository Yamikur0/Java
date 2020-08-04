/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2.Bai10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test_Toado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap hoanh do 1: ");
        int hd1 = input.nextInt();
        System.out.print("Nhap tung do 1: ");
        int td1 = input.nextInt();
        ToaDo tdm1 = new ToaDo(hd1, td1);
        
        System.out.print("Nhap hoanh do 2: ");
        int hd2 = input.nextInt();
        System.out.print("Nhap hoanh do 2: ");
        int td2 = input.nextInt();
        ToaDo tdm2 = new ToaDo(hd2, td2);
        
        double kq = tdm1.KhoangCachToiDiemKhac(tdm2);
        
        System.out.printf("Khoang cach tu diem toi goc toa do: %f\n", tdm1.KhoangCachToiGocToaDo());
        System.out.printf("Khoang cach giua hai diem: %f\n", kq);
    }
}
