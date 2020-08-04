/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong4.BTVD2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ReadWriteObject {
    public void writeDSSV(ArrayList<SinhVien> dssv, String fn){
        try {
            FileOutputStream fos = new FileOutputStream(fn);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(dssv);
            
            fos.close();
            oos.close();
        } catch (IOException ioe) {
            System.out.println("Loi" + ioe);
        }
    }
    
    public ArrayList<SinhVien> readDSSV(String fn){
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
        try {
            FileInputStream fis = new FileInputStream(fn);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            dssv = (ArrayList<SinhVien>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Loi" + e);
        }
        return dssv;
    }
}
