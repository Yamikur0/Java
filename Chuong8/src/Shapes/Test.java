/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        ShapeManagement sm = new ShapeManagement();
        sm.add(new Rectangle(1, 2, 3, 4));
        sm.add(new Circle(5, 60, 4));
        sm.add(new Rectangle(6, 8, 12, 4));
        System.out.println("Danh sach cac hinh:\n");
        System.out.println(sm.show());
        
        System.out.print("So luong hinh chu nhat: ");
        System.out.println(sm.countRectangle() + "\n");
        
        System.out.println("Hinh chu nhat co dien tich lon nhat\n");
        ArrayList<Shape> listMax = sm.findRectangleMaxArea();
        for (Shape invoice : listMax) {
            System.out.println(invoice.show()+"\n");
        }
        
        System.out.println("Sap xep dien tich hinh chu nhat tang dan\n");
        ArrayList<Shape> listSort = sm.sortArea();
        for (Shape invoice : listSort) {
            System.out.println(invoice.show()+"\n");
        }
    }
}
