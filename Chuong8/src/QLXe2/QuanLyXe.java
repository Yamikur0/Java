/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLXe2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QuanLyXe {

    private ArrayList<Oto> listOto;

    public ArrayList<Oto> getListOto() {
        return listOto;
    }

    public void setListOto(ArrayList<Oto> listOto) {
        this.listOto = listOto;
    }

    public QuanLyXe() {
        this.listOto = new ArrayList<>();
    }

    public void add(Oto oto) {
        listOto.add(oto);
    }

    public ArrayList<Oto> otoCoTrongTaiLon(int tt) {
        ArrayList<Oto> newds = new ArrayList<>();
        for (int i = 0; i < listOto.size(); i++) {
            if (listOto.get(i).getTrongTai() > tt) {
                newds.add(listOto.get(i));
            }
        }
        return newds;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < listOto.size(); i++) {
            s += listOto.get(i).toString() + "\n";
        }
        return s;
    }

}
