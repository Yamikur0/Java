/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLXe2;

/**
 *
 * @author Admin
 */
public class Text {
    public static void main(String[] args) {
        QuanLyXe qlx = new QuanLyXe();
        qlx.add(new Oto("KIA", 3000, 1999, 5, 3000));
        qlx.add(new Oto("KIA", 4000, 1996, 4, 1000));
        qlx.add(new Oto("LEX", 2000, 1993, 3, 5000));
        qlx.add(new Oto("RAD", 7000, 1991, 3, 400));
        qlx.add(new Oto("KAN", 9000, 1998, 2, 800));
        
        System.out.println(qlx.toString());
        
        System.out.println("Danh sach xe co trong tai > 1000");
        System.out.println(qlx.otoCoTrongTaiLon(1000));
        
    }
}
