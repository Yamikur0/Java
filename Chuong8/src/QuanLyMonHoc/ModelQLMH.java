/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyMonHoc;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ModelQLMH {
    private ArrayList<MonHoc> ds;
    
    public ArrayList<MonHoc> getDsMonHoc(){
        return ds;
    }
    
    public ModelQLMH(){
        ds = new ArrayList<MonHoc>();
    }
    public ModelQLMH(ArrayList<MonHoc> monHoc){
        this.ds = monHoc;
    }
    public void addMonHoc(MonHoc mh){
        ds.add(mh);
        System.out.println(ds.size());
    }
//    public void fixMonHoc(String maMH, MonHoc mh){
//        for (int i = 0; i < ds.size(); i++) {
//            if (mh.equals()) {
//                
//            }
//        }
//    }
}
