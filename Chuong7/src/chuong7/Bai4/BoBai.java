/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong7.Bai4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class BoBai {

    public static void main(String[] args) {
        QuanBai qb = new QuanBai();
        System.out.println(qb);
        Collections.shuffle(qb.getBoBai());//Xao tron cac la bai trong bo bai
        qb.setBoBai((ArrayList<String>) qb.getBoBai());
        System.out.println("Bo bai sau khi shuffle:\n");
        System.out.println(qb);
    }
}
