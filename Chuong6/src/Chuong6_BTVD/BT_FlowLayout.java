/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong6_BTVD;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class BT_FlowLayout {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        FlowLayout layout = new FlowLayout();
        Container container = frame.getContentPane();
        JButton btnLeft = new JButton("Left");
        JButton btnCenter = new JButton("Center");
        JButton btnRight = new JButton("Right");
        container.add(btnLeft);
        container.add(btnCenter);
        container.add(btnRight);
        frame.setLayout(layout);

        btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.LEFT);
                layout.layoutContainer(container);
            }
        });

        btnCenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.CENTER);
                layout.layoutContainer(container);
            }
        });

        btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layout.setAlignment(FlowLayout.RIGHT);
                layout.layoutContainer(container);
            }
        });

        frame.setSize(400, 200);
        frame.setTitle("Demo an empty frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
