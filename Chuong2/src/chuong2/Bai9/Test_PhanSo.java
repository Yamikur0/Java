/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2.Bai9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test_PhanSo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int ms;
            //Nhập phân số 1
            System.out.println("Phan so 1: ");
            System.out.print("Nhap tu so: ");
            int ts = input.nextInt();
            do {
                System.out.print("Nhap mau so: ");
                ms = input.nextInt();
            } while (ms < 1);
            //Nhập phân số 2
            System.out.println("Phan so 2: ");
            int ms2;
            System.out.print("Nhap tu so: ");
            int ts2 = input.nextInt();
            do {
                System.out.print("Nhap mau so: ");
                ms2 = input.nextInt();
            } while (ms2 < 1);
            
            //khai báo đối tượng
            PhanSo ps1 = new PhanSo(ts, ms);
            //khai báo đối tượng phân số mới
            PhanSo ps2 = new PhanSo(ts2, ms2);
            
            //In ra màn hình kết quả
            ps1 = ps1.toiGian();
            System.out.printf("Phan so toi gian 1 la: %d/%d%n", ps1.getTuSo(), ps1.getMauSo());
            ps2 = ps2.toiGian();
            System.out.printf("Phan so toi gian 2 la: %d/%d%n", ps2.getTuSo(), ps2.getMauSo());
            
            PhanSo kq1 = ps1.congPhanSo(ps2);
            kq1 = kq1.toiGian();
            System.out.printf("%d/%d + %d/%d = %d/%d%n", ts, ms, ts2, ms2, kq1.getTuSo(), kq1.getMauSo());
            
            PhanSo kq2 = ps1.truPhanSo(ps2);
            kq2 = kq2.toiGian();
            System.out.printf("%d/%d - %d/%d = %d/%d%n", ts, ms, ts2, ms2, kq2.getTuSo(), kq2.getMauSo());
            
            PhanSo kq3 = ps1.nhanPhanSo(ps2);
            kq3 = kq3.toiGian();
            System.out.printf("%d/%d * %d/%d = %d/%d%n", ts, ms, ts2, ms2, kq3.getTuSo(), kq3.getMauSo());
            
            PhanSo kq4 = ps1.chiaPhanSo(ps2);
            kq4 = kq4.toiGian();
            System.out.printf("%d/%d / %d/%d = %d/%d%n", ts, ms, ts2, ms2, kq4.getTuSo(), kq4.getMauSo());
            
            input.close();
        }
    }
}
