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
public class Score {
    public static void main(String[] args) {
     double score = 5.5;
     char grade = 'F';
     if (score >=8.5)
         grade = 'A';
     else if (score >= 7.0)
          grade = 'B';
     else if (score >= 5.5)
         grade = 'C';
     else if (score >= 4.0)
         grade = 'D';
     else
         grade = 'F';
        System.out.println(grade);
    }
}
