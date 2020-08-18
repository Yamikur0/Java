/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ontap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class QuanLyGiayDep {
    //field
    public LinkedList<GiayDep> dsgd;
    //properties
    public LinkedList<GiayDep> getDsgd() {
        return dsgd;
    }

    public void setDsgd(LinkedList<GiayDep> dsgd) {
        this.dsgd = dsgd;
    }
    //constructor
    public QuanLyGiayDep(){
        this.dsgd = new LinkedList<GiayDep>();
    }
    //method
    public void themDS(GiayDep gd){
        dsgd.add(gd);
    }
    public boolean xoaDS(String ma){
        if (ma == null) {
            return  false;
        }
        for (int i = 0; i < dsgd.size(); i++) {
            if (ma.equals(dsgd.get(i).getMa())) {
                dsgd.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean suaDS(GiayDep gd){
        for (int i = 0; i < dsgd.size(); i++) {
            if (dsgd.get(i).getMa().equals(gd.getMa())) {
                dsgd.set(i, gd);
                return true;
            }
        }
        return false;
    }
    
    public LinkedList<GiayDep> timGiaMin(){
        double min = dsgd.get(0).getGia();
        LinkedList<GiayDep> gd = new LinkedList<>();
        for (int i = 0; i < dsgd.size(); i++) {
            if (dsgd.get(i).getGia() < min) {
                min = dsgd.get(i).getGia();
            }
        }
        for (int i = 0; i < dsgd.size(); i++) {
            if (dsgd.get(i).getGia() == min) {
                gd.add(dsgd.get(i));
            }
        }
        return gd;
    }
    
    public LinkedList<GiayDep> sapXep(){
        LinkedList<GiayDep> lgd = (LinkedList<GiayDep>) dsgd.clone();
        lgd.sort(new Comparator<GiayDep>() {
            @Override
            public int compare(GiayDep t, GiayDep t1) {
                if (t.getLoai() == t1.getLoai()) {
                    if (t.getGia() == t1.getGia()) {
                        return 0;
                    }
                    else if (t.getGia() < t1.getGia()) {
                        return 1;
                    }else{
                        return -1;
                    }
                }else{
                    return t.getLoai() - t1.getLoai();
                }
            }
        });
        return lgd;
    }
    
    public static void writeFile(LinkedList<GiayDep> dsgd, String fileName) throws IOException{
        File f = new File(fileName);
        FileWriter fw = new FileWriter(f);
        for (int i = 0; i < dsgd.size(); i++) {
            fw.write(dsgd.get(i).toString());
            if (i < dsgd.size() - 1) {
                fw.write("\r\n");
            }
        }
        fw.close();
    }
    public static LinkedList<GiayDep> readFile(String fileName) throws FileNotFoundException, IOException{
        LinkedList<GiayDep> lgd = new LinkedList<GiayDep>();
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String[] dsgd;
        GiayDep gd;
        while ((line = br.readLine()) != null) {            
            dsgd = line.split(",");
            gd = new GiayDep(dsgd[0], Integer.parseInt(dsgd[1]), Integer.parseInt(dsgd[2]), Double.parseDouble(dsgd[3]));
            lgd.add(gd);
        }
        return lgd;
    }
}
