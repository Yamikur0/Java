/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

/**
 *
 * @author Admin
 */
public class HouseComponent extends JComponent {
    
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);//Khu rang cua
        Rectangle door = new Rectangle(70, 50, 30, 50);//Ve cua
        Ellipse2D.Double window = new Ellipse2D.Double(115, 50, 20, 20);// Ve cua so
        g2.setStroke(new BasicStroke(2));
        g2.drawLine(30, 50, 100, 10);//Noc nha ben trai
        g2.drawLine(170, 50, 100, 10);//Noc nha ben phai
        g2.drawLine(50, 40, 50, 100);//Tuong nha ben trai
        g2.drawLine(50, 100, 150, 100);//Tuong nha duoi
        g2.drawLine(150, 40, 150, 100);//Tuong nha ben phai
        g2.draw(window);
        g2.setColor(Color.yellow);
        g2.fill(window);
        g2.setColor(Color.black);
        g2.draw(door);
        g2.setColor(Color.green);
        g2.fill(door);
        
        
    }
}
