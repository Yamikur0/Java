/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huynhduongmyuyen_de1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class QuanLySanPham {
    private ArrayList<SanPham> listsp;

    public ArrayList<SanPham> getSp() {
        return listsp;
    }

    public void setSp(ArrayList<SanPham> sp) {
        this.listsp = sp;
    }
    
    public QuanLySanPham(){
        this.listsp = new ArrayList<>();
    }
    
    public void themSanPham(SanPham sp){
        listsp.add(sp);
    }
    
    public double tinhTongDienTichSanPhamHinhChuNhat(){
        double tong = 0;
        for (SanPham sanPham : listsp) {
            if (sanPham instanceof SanPhamHinhChuNhat) {
                tong += sanPham.tinhDienTich();
            }            
        }
        return tong;
    }
    
    public ArrayList<SanPham> layDsSanPhamCoTrongLuongMax(){
        double max = listsp.get(0).getTrongLuong();
        ArrayList<SanPham> sp = new ArrayList<>();
        for (int i = 0; i < listsp.size(); i++) {
            if (listsp.get(i).getTrongLuong() > max) {
                max = listsp.get(i).getTrongLuong();
            }
        }
        for (int i = 0; i < listsp.size(); i++) {
            if (listsp.get(i).getTrongLuong() == max) {
                sp.add(listsp.get(i));
            }
        }
        return sp;
    }
    
    public double tinhTongTrongLuongTheoLoai(int loai){
        double tl = 0;
        if (loai == 1) {
            for (SanPham sanPham : listsp) {
                if (sanPham instanceof SanPhamHinhTron) {
                    tl += sanPham.getTrongLuong();
                }
            }
        }else{
            for (SanPham sanPham : listsp) {
                if (sanPham instanceof SanPhamHinhChuNhat) {
                    tl += sanPham.getTrongLuong();
                }
            }
        }
        return tl;
    }
    
    public ArrayList<SanPham> sapXepTrongLuongTangDan(){
        ArrayList<SanPham> dssp = (ArrayList<SanPham>) listsp.clone();
        dssp.sort(new Comparator<SanPham>() {
            @Override
            public int compare(SanPham t, SanPham t1) {
                return (int) (t.getTrongLuong() - t1.getTrongLuong());
            }
        });
        return dssp;
    }
}
