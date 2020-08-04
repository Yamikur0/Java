/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class House {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        HouseComponent componen = new HouseComponent();

        frame.add(componen);

        frame.setVisible(true);
    }
}
