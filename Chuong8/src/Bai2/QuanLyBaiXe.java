/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyBaiXe {
    private ArrayList<Xe> qlx;

    public ArrayList<Xe> getQlx() {
        return qlx;
    }

    public void setQlx(ArrayList<Xe> qlx) {
        this.qlx = qlx;
    }
    
    public QuanLyBaiXe(){
        this.qlx = new ArrayList<>();
    }
    
    public void add(Xe xe){
        qlx.add(xe);
    }
    
    public double TongTienPhi(){
        double tong = 0;
        for (Xe xe : qlx) {
            tong += xe.dongPhi();
        }
        return tong;
    }
    
    public String Print() {
        String s = "";
        for (int i = 0; i < qlx.size(); i++) {
            s += qlx.get(i).toString() + "\n";
        }
        return s;
    }
}
