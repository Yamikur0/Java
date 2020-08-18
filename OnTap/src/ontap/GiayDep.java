/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

/**
 *
 * @author Admin
 */
public class GiayDep {
    //field
    private String ma;
    private int loai;
    private int size;
    private double gia;
    //properties
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    //constructor
    //PTKT khong tham so
    public GiayDep(){
        
    }
    //PTKT day du tham so
    public GiayDep(String ma, int loai, int size, double gia){
        if (ma == null || loai < 1 || size < 1 || gia < 0) {
            throw new IllegalArgumentException();
        }
        this.ma = ma;
        this.loai = loai;
        this.size = size;
        this.gia = gia;
    }
    //in

    @Override
    public String toString() {
        return ma + "," + loai + "," + size + "," + gia;
    }
    
}
