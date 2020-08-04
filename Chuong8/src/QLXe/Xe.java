/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLXe;

/**
 *
 * @author Admin
 */
public class Xe {
    private String nhanHieu;
    private double gia;
    private int namSanXuat;

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public Xe() {
    }

    public Xe(String nhanHieu, double gia, int namSanXuat) {
        this.nhanHieu = nhanHieu;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "Car{" + "nhanHieu=" + nhanHieu + ", gia=" + gia + ", namSanXuat=" + namSanXuat + '}';
    }
}
