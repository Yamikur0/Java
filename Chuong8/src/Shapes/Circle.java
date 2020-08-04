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
public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){}
    
    public Circle(int x, int y, double radius){
        super(new Point(x, y));
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * 3.14;
    }
    
    public int compareTo(Shape o) {
        return (int) (this.calculateArea() - o.calculateArea());
    }
    
    public String show(){
        String s = "x: "+ startPoint.getX() +"\n"+"y: "+startPoint.getY()+"\n"
                +"Area: "+calculateArea()+"\t"+"Perimeter: "+calculatePerimeter()+"\n";
        return s;
    }
}
