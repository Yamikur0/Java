/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9;

/**
 *
 * @author Administrator
 */
public class PhanSo {

    private int tuSo;
    private int mauSo;

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    private int UCLN() {
        int a = this.getTuSo();
        int b = this.getMauSo();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public PhanSo toiGian(){
        PhanSo result = new PhanSo();
        int ucln = this.UCLN();
        result.setTuSo(this.getTuSo()/ucln);
        result.setMauSo(this.getMauSo()/ucln);
        return result;
    }
    
    public PhanSo congPhanSo(PhanSo ps) {
        PhanSo result = new PhanSo();
        result.setTuSo(this.getTuSo() * ps.getMauSo() + this.getMauSo() * ps.getTuSo());
        result.setMauSo(this.getMauSo() * ps.getMauSo());
        return result.toiGian();
    }
    
    public PhanSo truPhanSo(PhanSo ps) {
        PhanSo result = new PhanSo();
        result.setTuSo(this.getTuSo() * ps.getMauSo() - this.getMauSo() * ps.getTuSo());
        result.setMauSo(this.getMauSo() * ps.getMauSo());
        return result.toiGian();
    }
    
    public PhanSo nhanPhanSo(PhanSo ps) {
        PhanSo result = new PhanSo();
        result.setTuSo(this.getTuSo() * ps.getTuSo());
        result.setMauSo(this.getMauSo() * ps.getMauSo());
        return result.toiGian();
    }
   
    public PhanSo chiaPhanSo(PhanSo ps) {
        PhanSo result = new PhanSo();
        result.setTuSo(this.getTuSo() * ps.getMauSo());
        result.setMauSo(this.getMauSo() * ps.getTuSo());
        return result.toiGian();
    }
    
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
}
