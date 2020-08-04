/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2.Bai10;

/**
 *
 * @author Admin
 */
public class ToaDo {
    
    //field
    private double td;
    private double hd;

    ToaDo(int hd1, ToaDo td1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //properties
    public double getTd() {
        return td;
    }

    public void setTd(double td) {
        this.td = td;
    }

    public double getHd() {
        return hd;
    }

    
    public void setHd(double hd) {
        this.hd = hd;
    }

    //Constructor
    public ToaDo() {
    }

    public ToaDo(double td, double hd) {
        this.td = td;
        this.hd = hd;
    }

    public double KhoangCachToiGocToaDo() {
        return Math.sqrt(Math.pow(td, 2) + Math.pow(hd, 2));
    }
    
    public double KhoangCachToiDiemKhac(ToaDo tdm){
        return Math.sqrt(Math.pow((tdm.getHd()-this.getHd()), 2)+Math.pow((tdm.getTd()-this.getTd()), 2));
    }
}
