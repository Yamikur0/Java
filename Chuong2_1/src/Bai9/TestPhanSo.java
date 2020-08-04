/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

/**
 *
 * @author Administrator
 */
public class TestPhanSo {

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(2, 3);
        PhanSo ps2 = new PhanSo(3, 5);
        System.out.println(ps1.congPhanSo(ps2).toString());
        System.out.println(ps1.truPhanSo(ps2).toString());
        System.out.println(ps1.nhanPhanSo(ps2).toString());
        System.out.println(ps1.chiaPhanSo(ps2).toString());
    }
}
