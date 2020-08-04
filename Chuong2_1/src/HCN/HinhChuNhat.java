/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HCN;

/**
 *
 * @author Administrator
 */
public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;
    
    public HinhChuNhat(){
    }
    
    public HinhChuNhat(int chieuDai, int chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    public  int tinhDienTich(){
        return chieuDai * chieuRong;
    }
    
    public int tinhChuVi(){
        return (chieuDai + chieuRong) * 2;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }
    
}
