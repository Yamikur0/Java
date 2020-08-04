/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong6_BTVD;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class BT_BorderLayout {

    public static void main(String[] args) {
        JFrame jf = new JFrame();

        BorderLayout bdlo = new BorderLayout();
        bdlo.setHgap(10);
        bdlo.setVgap(10);
        jf.setLayout(bdlo);

        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("WEST");
        JButton b5 = new JButton("CENTER");

        jf.add(b1, BorderLayout.NORTH);
        jf.add(b2, BorderLayout.SOUTH);
        jf.add(b3, BorderLayout.EAST);
        jf.add(b4, BorderLayout.WEST);
        jf.add(b5, BorderLayout.CENTER);

        jf.setSize(1000, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
