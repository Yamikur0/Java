/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2.Bai9;

/**
 *
 * @author Admin
 */
public class PhanSo {

    //field
    private int tuSo;
    private int mauSo;
    //properties

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

    //Constructor
    public PhanSo() { // không có tham số
    }
// có 2 tham số tử và mẫu
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
// tìm ước số chung lớn nhất
    public int timUSCLN() {
        int a;
        int b;
        a = this.getTuSo();
        b = this.getMauSo();
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
// tối giản phân số
    public PhanSo toiGian() {
        PhanSo phso = new PhanSo();
        int n = timUSCLN();
        phso.setTuSo(this.getTuSo()/n);
        phso.setMauSo(this.getMauSo()/n);
        return phso;
    }
    //công phân số 
    public PhanSo congPhanSo(PhanSo ps)
    {
        PhanSo ketqua = new PhanSo();
        ketqua.setTuSo(this.getTuSo()*ps.getMauSo()+this.getMauSo()*ps.getTuSo());
        ketqua.setMauSo(this.getMauSo()*ps.getMauSo());
        return ketqua;
    }
    // trừ phân số 
    public PhanSo truPhanSo(PhanSo ps)
    {
        PhanSo ketqua = new PhanSo();
        ketqua.setTuSo(this.getTuSo()*ps.getMauSo()-this.getMauSo()*ps.getTuSo());
        ketqua.setMauSo(this.getMauSo()*ps.getMauSo());
        return ketqua;
    }
    // nhân phân số
    public PhanSo nhanPhanSo(PhanSo ps)
    {
        PhanSo ketqua = new PhanSo();
        ketqua.setTuSo(this.getTuSo()*ps.getTuSo());
        ketqua.setMauSo(this.getMauSo()*ps.getMauSo());
        return ketqua;
    }
    //chia phân số
    public PhanSo chiaPhanSo(PhanSo ps)
    {
        PhanSo ketqua = new PhanSo();
        ketqua.setTuSo(this.getTuSo()*ps.getMauSo());
        ketqua.setMauSo(this.getMauSo()*ps.getTuSo());
        return ketqua;
    }
}
