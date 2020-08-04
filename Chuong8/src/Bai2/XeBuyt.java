/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

/**
 *
 * @author Admin
 */
public class XeBuyt extends Xe{
    private String tuyenXe;

    public String getTuyenXe() {
        return tuyenXe;
    }

    public void setTuyenXe(String tuyenXe) {
        this.tuyenXe = tuyenXe;
    }
    
    public XeBuyt(){
        
    }
    public XeBuyt(String bienSo, String mauXe, int soChoNgoi, String tuyenXe){
        super(bienSo, mauXe, soChoNgoi);
        this.tuyenXe = tuyenXe;
    }

    @Override
    public double dongPhi() {
        return getSoChoNgoi()*1000;
    }
    
    @Override
    public String toString() {
        return String.format("Xe buyt:\n Bien so: %s\n Mau xe: %s\n So cho ngoi: %d\n Tuyen xe: %s\n Dong phi: %.0f\n",getBienSo(),getMauXe(),getSoChoNgoi(),getTuyenXe(),dongPhi());
    }
    
}
