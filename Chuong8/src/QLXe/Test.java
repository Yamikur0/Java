/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLXe;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
         QuanLyXe ql = new QuanLyXe();
        
        ql.AddCar(new Oto(4, 10, "KIA", 10000, 2010));
        ql.AddCar(new Oto(4, 1000, "KIA", 10000, 2010));
        ql.AddCar(new Oto(4, 1001, "KIA2", 10000, 2010));
        ql.AddCar(new Oto(4, 999, "KIA3", 10000, 2010));
        ql.AddCar(new Oto(4, 1002, "KIA4", 10000, 2010));
        ql.AddCar(new Oto(4, 1003, "KIA5", 10000, 2010));
        ql.AddCar(new Oto(4, 998, "KIA6", 10000, 2010));
        
        System.out.println(ql.PrintList(ql.getBrand("KIA")));
        System.out.println(ql.PrintList(ql.getTonnageBigger(1000)));
    }
}
