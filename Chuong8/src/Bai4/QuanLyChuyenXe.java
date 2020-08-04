/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyChuyenXe {
    private ArrayList<ChuyenXe> listcx;

    public ArrayList<ChuyenXe> getCs() {
        return listcx;
    }

    public void setCs(ArrayList<ChuyenXe> cx) {
        this.listcx = cx;
    }
    
    public QuanLyChuyenXe(){
        this.listcx = new ArrayList<>();
    }
    
    public void add(ChuyenXe cx){
        listcx.add(cx);
    }
    
    public ArrayList<ChuyenXe> CacXeCoTongDoanhThuCao() {
        double max = listcx.get(0).getDoanhThu();
        ArrayList<ChuyenXe> cx = new ArrayList<>();
        for (int i = 0; i < listcx.size(); i++) {
            if (listcx.get(i).getDoanhThu()> max) {
                max = listcx.get(i).getDoanhThu();
            }
        }
        for (int i = 0; i < listcx.size(); i++) {
            if (listcx.get(i).getDoanhThu()== max) {
                cx.add(listcx.get(i));
            }
        }
        return cx;
    }
    
    public double TongDoanhThuKhiBietLoai(ChuyenXe cx){
        double dt = 0;
        if (cx instanceof ChuyenXeNoiThanh) {
            for (ChuyenXe chuyenXe : listcx) {
                if (chuyenXe instanceof ChuyenXeNoiThanh) {
                    dt += chuyenXe.getDoanhThu();
                }
            }
        }else{
            for (ChuyenXe chuyenXe : listcx) {
                if (chuyenXe instanceof ChuyenXeNgoaiThanh) {
                    dt += chuyenXe.getDoanhThu();
                }
            }
        }
        return dt;
    }
    public double TongTienThuongKhiBietLoai(ChuyenXe cx){
        double tth = 0;
        if (cx instanceof ChuyenXeNoiThanh) {
            for (ChuyenXe chuyenXe : listcx) {
                if (chuyenXe instanceof ChuyenXeNoiThanh) {
                    tth += chuyenXe.TinhLuong();
                }
            }
        }else{
            for (ChuyenXe chuyenXe : listcx) {
                if (chuyenXe instanceof ChuyenXeNgoaiThanh) {
                    tth += chuyenXe.TinhLuong();
                }
            }
        }
        return tth;
    }
}
