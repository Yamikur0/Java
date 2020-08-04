/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

/**
 *
 * @author Administrator
 */
public class Score2 {
    public static void main(String[] args) {
     char grade = 'B';
     switch (grade){
         case 'A':
             System.out.println("Exellent!");
             break;
         case 'B':
             System.out.println("Great!");
             break;
         case 'C':
         case 'D':
             System.out.println("Well done!");
             break;
         case 'F':
             System.out.println("Sorry, you failed.");
             break;
         default:
             System.out.println("Error! Invalid grade.");
     }
    }
}
