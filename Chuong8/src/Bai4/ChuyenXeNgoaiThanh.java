/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Admin
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    private String noiDen;
    private int soNgayDiDuoc;

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }
    
    public ChuyenXeNgoaiThanh(){
        
    }
    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, String noiDen, int soNgayDiDuoc, double doanhThu){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public double TinhLuong() {
        return getDoanhThu() * 0.05;
    }
    
    @Override
    public String toString() {
        return String.format("Chuyen Xe Ngoai Thanh:\n Ma So Chuyen: %s\n Doanh Thu: %.0f\n Luong: %.0f\n",getMaSoChuyen(), getDoanhThu(),TinhLuong());
    }
}
