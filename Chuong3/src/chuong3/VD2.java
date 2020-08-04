/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong3;

/**
 *
 * @author Administrator
 */
public class VD2 {

    public double div(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("loi chia cho 0");
        } else {
            return a / b;
        }
    }
}
