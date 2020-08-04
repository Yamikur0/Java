/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7.Bai1;



/**
 *
 * @author Admin
 */
public class NhanVien implements Comparable<NhanVien>{
    
    private String maNhanVien;
    private String hoTen;
    private int doanhThu;
    
    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public NhanVien(){}
    
    public NhanVien(String maNhanVien, String hoTen, int doanhThu){
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.doanhThu = doanhThu;
    }

    @Override
    public int compareTo(NhanVien nv) {
        if (doanhThu == nv.doanhThu) {
            return 0;
        } else if (doanhThu < nv.doanhThu) {
            return 1;
        } else {
            return -1;
        }
    } 
}
