/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7.Bai1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<NhanVien> listOfNV = new ArrayList<>();
        listOfNV.add(new NhanVien("1","An",2200000));
        listOfNV.add(new NhanVien("2","Binh",1200000));
        listOfNV.add(new NhanVien("3","Cong",3200000));
        
        Collections.sort(listOfNV);
        for (NhanVien nv : listOfNV) {
            System.out.println(nv.getMaNhanVien() + " " + nv.getHoTen() + " " + nv.getDoanhThu());
        }
    }
}
