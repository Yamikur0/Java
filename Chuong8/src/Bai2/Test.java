/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        QuanLyBaiXe qlbx = new QuanLyBaiXe();
        qlbx.add(new XeHoi("123", "do", 10, "L"));
        qlbx.add(new XeHoi("234", "cam", 20, "M"));
        qlbx.add(new XeHoi("345", "vang", 40, "S"));
        qlbx.add(new XeBuyt("456", "xanh", 50, "456"));
        qlbx.add(new XeBuyt("567", "lam", 60, "567"));
        
        System.out.print(qlbx.Print());
        
        System.out.println("Tong tien phi thu duoc cua cac xe: " + qlbx.TongTienPhi());
    }
}
