/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhduongmyuyen_de1;

/**
 *
 * @author Administrator
 */
public abstract class SanPham {
    private double trongLuong;

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }
    
    public SanPham(){
        
    }
    public SanPham(double trongLuong){
        this.trongLuong = trongLuong;
    }
    
    public abstract double tinhDienTich();
}
