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
public class VD {

    public static void main(String[] args) {
//        try {
//            int a = 8;
//            int b = 2;
//            int c = a / b;
//
//            int[] arr = {5, 10};
//            arr[1] = 15;
//
//            System.out.println(c);
//        } catch (ArithmeticException ae) {
//            System.out.println("loi chia cho 0: " + ae);
//        } catch (Exception e) {
//            System.out.println("loi khac: " + e);
//        } finally {
//            System.out.println("mlem");
//        }
        try {
            VD2 caculator = new VD2();
            caculator.div(5, 0);
        } catch (ArithmeticException ae){
            System.out.println(ae);
        }
        
    }
}
