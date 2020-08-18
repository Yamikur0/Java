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
public class SanPhamHinhChuNhat extends SanPham{
    private double chieuDai;
    private double chieuRong;

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public SanPhamHinhChuNhat(){
        
    }
    public SanPhamHinhChuNhat(double chieuDai, double chieuRong, double trongTai){
        super(trongTai);
        if (chieuDai < 0 || chieuRong < 0) {
            throw new IllegalArgumentException();
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return getChieuDai()*getChieuRong();
    }

    @Override
    public String toString() {
        return String.format("SanPhamHinhChuNhat(%.0f, %.0f, %.1f)", getChieuDai(),getChieuRong(),getTrongLuong());
    }
    
    
}
