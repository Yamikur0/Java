/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCN;

/**
 *
 * @author Administrator
 */
public class KiemTraHCN {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat(4,5);
        HinhChuNhat hcn2 = new HinhChuNhat(7,3);
        HinhChuNhat hcn3 = new HinhChuNhat(20,33);
        
        System.out.printf("HCN1(%d, %d)có DT là %d và CV là %d%n",hcn1.getChieuDai(),hcn1.getChieuRong(),hcn1.tinhDienTich(),hcn1.tinhChuVi());
        System.out.printf("HCN2(%d, %d)có DT là %d và CV là %d%n",hcn2.getChieuDai(),hcn2.getChieuRong(),hcn2.tinhDienTich(),hcn2.tinhChuVi());
        System.out.printf("HCN3(%d, %d)có DT là %d và CV là %d%n",hcn3.getChieuDai(),hcn3.getChieuRong(),hcn3.tinhDienTich(),hcn3.tinhChuVi());
    }
}
