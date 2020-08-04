/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of seconds: ");
        int seconds = input.nextInt();
        long sec = seconds % 60;
        long minutes = seconds % 3600 / 60;
        long hours = seconds % 86400 / 3600;
        System.out.printf("Result: %02d:%02d:%02d\n", hours, minutes, sec);
    }
}
