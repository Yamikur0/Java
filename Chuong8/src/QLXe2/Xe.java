/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLXe2;

/**
 *
 * @author Admin
 */
public class Xe {
    private String nhanHieu;
    private int gia;
    private int namSanXuat;

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    
    public Xe(){
        
    }
    public Xe(String nhanHieu, int gia, int namSanXuat){
        this.nhanHieu = nhanHieu;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "Xe{" + "nhanHieu=" + nhanHieu + ", gia=" + gia + ", namSanXuat=" + namSanXuat + '}';
    }
    
}
