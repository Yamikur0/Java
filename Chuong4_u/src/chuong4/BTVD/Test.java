/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4.BTVD;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        
        ArrayList<SinhVien> dssv = new ArrayList<>();
        dssv.add(new SinhVien("123TT", "uyen", 2001));
        dssv.add(new SinhVien("345TT", "tam", 2000));
        dssv.add(new SinhVien("567TT", "anh", 1999));
        WriteReadFile wlsv = new WriteReadFile();
        wlsv.WriteListSV(dssv, "F:\\Java\\Chuong4_u\\ListSV.txt");
        wlsv.readDSSV("F:\\Java\\Chuong4_u\\ListSV.txt").forEach((sv) -> {
            System.out.println(sv);
        });
    }

}
