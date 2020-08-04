/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMonHoc;

/**
 *
 * @author Administrator
 */
public class MonHoc {
    private String maMonHoc;
    private String tenMonHoc;
    private int tinChi;

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getTinChi() {
        return tinChi;
    }

    public void setTinChi(int tinChi) {
        this.tinChi = tinChi;
    }
    
    public MonHoc(){
        
    }
    public MonHoc(String maMonHoc, String tenMonHoc, int tinChi){
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.tinChi = tinChi;
    }

    @Override
    public String toString() {
        return "MonHoc{" + "maMonHoc=" + maMonHoc + ", tenMonHoc=" + tenMonHoc + ", tinChi=" + tinChi + '}';
    }
}
