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
public class Oto extends Xe{
    private int soCho;
    private int trongTai;

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }
    
    public Oto(){
        
    }
    public Oto(String nhanHieu, int gia, int namSanXuat, int soCho, int trongTai){
        super(nhanHieu, gia, namSanXuat);
        this.soCho = soCho;
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        String s = "\n Nhan hieu:\t"+ getNhanHieu()+"\n Gia:\t\t"+getGia()+"\n Nam san xuat:\t"+getNamSanXuat()
                +"\n So cho:\t"+getSoCho()+"\n Trong tai:\t"+getTrongTai();
        return s;
    }
    
}
