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
public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Width: ");
        int width = input.nextInt();
        System.out.print("Enter Length: ");
        int length = input.nextInt();
        System.out.printf("Perimeter of Rectangle(%d,%d) is %d\n",width,length,(width+length)*2);
        System.out.printf("Area of Rectangle(%d,%d) is %d\n",width,length, width*length);
    }
}
