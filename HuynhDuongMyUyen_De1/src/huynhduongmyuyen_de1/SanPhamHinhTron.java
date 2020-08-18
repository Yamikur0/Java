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
public class SanPhamHinhTron extends SanPham{
    private double banKinh;

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public SanPhamHinhTron(){
        
    }
    public SanPhamHinhTron(double banKinh, double trongLuong){
        super(trongLuong);
        if (banKinh < 0) {
            throw new IllegalArgumentException();
        }
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return getBanKinh()*getBanKinh()*3.14;
    }

    @Override
    public String toString() {
        return String.format("SanPhamHinhTron(%.0f, %.1f)", getBanKinh(),getTrongLuong()) ;
    }
    
    
}
