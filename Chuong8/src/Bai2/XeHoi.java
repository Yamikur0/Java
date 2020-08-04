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
public class XeHoi extends Xe{
    private String hangXe;

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }
    
    public XeHoi(){
        
    }
    public XeHoi(String bienSo, String mauXe, int soChoNgoi, String hangXe){
        super(bienSo, mauXe, soChoNgoi);
        this.hangXe = hangXe;
    }

    @Override
    public double dongPhi() {
        double p = 0;
        if (getSoChoNgoi() > 30) {
            p = getSoChoNgoi() * 5000 * 0.8;
        }else{
            p = getSoChoNgoi() * 5000;
        }
        return p;
    }

    @Override
    public String toString() {
        return String.format("Xe hoi:\n Bien so: %s\n Mau xe: %s\n So cho ngoi: %d\n Hang xe: %s\n Dong phi: %.0f\n",getBienSo(),getMauXe(),getSoChoNgoi(),getHangXe(),dongPhi());
    }
        
}
