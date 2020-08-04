/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4.BTVD;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class WriteReadFile {
    public void WriteListSV(ArrayList<SinhVien> dssv, String fn){
        try {
            FileWriter fw = new FileWriter(fn);
            try (BufferedWriter bfwt = new BufferedWriter(fw)) {
                SinhVien sv = null;
                for (int i = 0; i < dssv.size(); i++) {
                    sv = dssv.get(i);
                    bfwt.write(sv.toString());
                    if (i<dssv.size()-1) {
                        bfwt.write("\r\n");
                    }
                }
            }
        } catch (IOException ioe) {
            System.out.println("loi" + ioe);
        }
    }
    
    public ArrayList<SinhVien> readDSSV(String fn){
        ArrayList<SinhVien> dssv = new ArrayList<>();
        try {
            FileReader frd = new FileReader(fn);
            try (BufferedReader bfrd = new BufferedReader(frd)) {
                SinhVien sv = null;
                String line = null;
                while ((line = bfrd.readLine()) !=null) {
                    String[] svinf = line.split("-");
                    sv = new SinhVien(svinf[0],svinf[1], Integer.parseInt(svinf[2]));
                    dssv.add(sv);
                }
            }
        } catch (IOException ioe) {
            System.out.println("loi" + ioe);
        }
        return dssv;
    }
}
