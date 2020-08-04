/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcs = new QuanLyChuyenXe();
        qlcs.add(new ChuyenXeNgoaiThanh("123", "uyn", 123, "tphcm", 2, 100000));
        qlcs.add(new ChuyenXeNgoaiThanh("234", "uyn", 123, "tphcm", 2, 200000));
        qlcs.add(new ChuyenXeNgoaiThanh("456", "uyn", 123, "tphcm", 2, 300000));
        qlcs.add(new ChuyenXeNoiThanh("123", "uyn", 123, "123", 50, 100000));
        qlcs.add(new ChuyenXeNoiThanh("234", "uyn", 123, "123", 50, 300000));
        qlcs.add(new ChuyenXeNoiThanh("456", "uyn", 123, "123", 50, 300000));
        
        System.out.println("Cac xe co doanh thu cao\n");
        ArrayList<ChuyenXe> listdtc = qlcs.CacXeCoTongDoanhThuCao();
        for (ChuyenXe chuyenXe : listdtc) {
            System.out.println(chuyenXe.toString());
        }
        
        System.out.println("Tong doanh thu khi biet loai chuyen xe:");
        System.out.println("Chuyen xe ngoai thanh: " + qlcs.TongDoanhThuKhiBietLoai(new ChuyenXeNgoaiThanh()));
        System.out.println("Chuyen xe noi thanh: " + qlcs.TongDoanhThuKhiBietLoai(new ChuyenXeNoiThanh()));
        
        System.out.println("\nTong tien thuong khi biet loai chuyen xe:");
        System.out.println("Chuyen xe ngoai thanh: " + qlcs.TongTienThuongKhiBietLoai(new ChuyenXeNgoaiThanh()));
        System.out.println("Chuyen xe noi thanh: " + qlcs.TongTienThuongKhiBietLoai(new ChuyenXeNoiThanh()));
    }
}
