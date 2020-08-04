/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapes;

/**
 *
 * @author Administrator
 */
public class Rectangle extends Shape{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public Rectangle(){}
    
    public Rectangle(int x, int y, int width,int height) {
        super(new Point(x, y));
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return (width + height)*2;
    }

    
    public String show(){
        String s = "x: "+ startPoint.getX() +"\n"+"y: "+startPoint.getY()+"\n"
                +"width: "+width+"\n"+"height: "+height+"\n"
                +"Area: "+calculateArea()+"\t"+"Perimeter: "+calculatePerimeter()+"\n";
        return s;
    }   
}
