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
public abstract class Shape{
    protected Point startPoint;

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Shape() {
    }
    
    public Shape (Point point){
        this.startPoint = point;
    }
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();


    public String show() {
        return "Shape{" + "startPoint=" + startPoint + '}';
    }
    
    

}
