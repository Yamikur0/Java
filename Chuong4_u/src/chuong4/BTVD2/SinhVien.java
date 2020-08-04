/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4.BTVD2;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class SinhVien implements Serializable{
    private String mssv;
    private String ten;
    private int namSinh;

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public SinhVien(){}
    
    public SinhVien(String mssv, String ten, int namSinh){
        this.mssv = mssv;
        this.ten = ten;
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return mssv + "-" + ten + "-" + namSinh;
    }
}
