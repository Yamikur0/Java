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
public class ChuyenXeNoiThanh extends ChuyenXe{
    private String soTuyen;
    private int soKmDiDuoc;

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKmDiDuoc() {
        return soKmDiDuoc;
    }

    public void setSoKmDiDuoc(int soKmDiDuoc) {
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public ChuyenXeNoiThanh(){
        
    }
    public ChuyenXeNoiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, String soTuyen, int soKmDiDuoc, double doanhThu){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }
    @Override
    public double TinhLuong() {
        return getDoanhThu() * 0.1;
    }
    
    @Override
    public String toString() {
        return String.format("Chuyen Xe Noi Thanh:\n Ma So Chuyen: %s\n Doanh Thu: %.0f\n Luong: %.0f\n",getMaSoChuyen(), getDoanhThu(),TinhLuong());
    }
       
}
