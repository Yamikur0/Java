/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Administrator
 */
public class VD2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR);
        System.out.printf("Bay gio la: %02d:%tM %Tp %td-%Tm-%tY%n",hour,cal,cal,cal,cal,cal);
    }
}
