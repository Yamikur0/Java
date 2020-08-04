/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7.Bai4;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QuanBai {

    private static String[] soqb = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static String[] bt = {"co", "ro", "chuon", "bich"};
    private ArrayList<String> boBai = new ArrayList<>();

    public ArrayList<String> getBoBai() {
        return boBai;
    }

    public void setBoBai(ArrayList<String> boBai) {
        this.boBai = boBai;
    }
    
    //Them cac quan bai vao danh sach
    public QuanBai() {
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                boBai.add(soqb[i] + bt[j]);
            }
        }
    }

    @Override
    //In ra danh sach quan bai
    public String toString() {
        String s = "";
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                s += boBai.get((i * 4) + j) + "\t";
            }
            s += "\n";
        }
        return s;
    }

}
