/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class ShapeManagement {

    private ArrayList<Shape> shapeList;

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    public void setShapeList(ArrayList<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public ShapeManagement() {
        this.shapeList = new ArrayList<>();
    }

    public void add(Shape shp) {
        shapeList.add(shp);
    }

    public int countRectangle() {
        int count = 0;
        for (Shape shape : shapeList) {
            if (shape instanceof Rectangle) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Shape> findRectangleMaxArea() {
        double max = 0;
        ArrayList<Shape> rs = new ArrayList<>();
        for (Shape shape : shapeList) {
            if (shape instanceof Rectangle) {
                if (max < shape.calculateArea()) {
                    max = shape.calculateArea();
                }
            }  
        }
        for (Shape shape : shapeList) {
            if (shape instanceof Rectangle) {
                if (max == shape.calculateArea()) {
                    rs.add(shape);
                }
            }  
        }
        return rs;
    }

    public ArrayList<Shape> sortArea(){
        ArrayList<Shape> newShape = (ArrayList<Shape>)shapeList.clone();
        newShape.sort(new Comparator<Shape>(){
            @Override
            public int compare(Shape o1, Shape o2) {
                if (o1.calculateArea() == o2.calculateArea()) {
                    return 0;
                }else if (o1.calculateArea() > o2.calculateArea()) {
                    return 1;
                }else{
                    return -1;
                }
            }           
        });
        return newShape;
    }
    
    public String show() {
        String s = "";
        for (int i = 0; i < shapeList.size(); i++) {
            s += shapeList.get(i).show() + "\n";
        }
        return s;
    }
}
