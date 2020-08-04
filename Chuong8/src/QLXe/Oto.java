/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLXe;

/**
 *
 * @author Admin
 */
public class Oto extends Xe{
    private int soCho;
    private double trongTai;

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    public Oto() {
    }

    public Oto(int soCho, double trongTai, String nhanHieu, double gia, int namSanXuat) {
        super(nhanHieu, gia, namSanXuat);
        this.soCho = soCho;
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("%-20s%s%n","Nhan hieu:",getNhanHieu()));
        sb.append(String.format("%-20s%s%n","Gia:",getGia()));
        sb.append(String.format("%-20s%s%n","Nam san xuat:",getNamSanXuat()));
        sb.append(String.format("%-20s%s%n","So cho:",getSoCho()));
        sb.append(String.format("%-20s%s%n","Trong tai:",getTrongTai()));
        
        return sb.toString();
    }
}
