/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Qlhoadon;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        Customer ct1 = new Customer("Uyen", "01234567", "123");
        Customer ct2 = new Customer("Mai", "01234567", "456");
        Customer ct3 = new Customer("Nam", "01234567", "789");
        
        Invoice inv1 = new Invoice("567", ct1);
        inv1.add(new Product("Notebook 200 pages", 330000), 4);
        inv1.add(new Product("Ruler", 5000), 1);
        inv1.add(new Product("Ballpen", 2500), 3);
        
        Invoice inv2 = new Invoice("678", ct2);
        inv2.add(new Product("Notebook 200 pages", 140000), 4);
        inv2.add(new Product("Ruler", 6000), 1);
        inv2.add(new Product("Ballpen", 3500), 3);
        
        Invoice inv3 = new Invoice("789", ct3);
        inv3.add(new Product("Notebook 200 pages", 50000), 4);
        inv3.add(new Product("Ruler", 7000), 1);
        inv3.add(new Product("Ballpen", 4500), 3);
        
        //Them danh sach hoa don
        InvoiceManage listInv = new InvoiceManage();
        listInv.add(inv1);
        listInv.add(inv2);
        listInv.add(inv3);
        
        System.out.println("Danh sach hoa don\n");
        System.out.println(listInv.format());
        
        //Xoa danh sach hoa don khi biet ma hoa don
        System.out.println("Xoa danh sach hoa don khi biet ma hoa don\n");
        if (listInv.remove("") == true) {
            System.out.println("Da xoa hoa don\n");
            System.out.println("Danh sach hoa don sau khi xoa\n");
            System.out.println(listInv.format());

        } else {
            System.out.println("Hoa don khong ton tai\n");
        }
        
        //Tim hoa don co tong tien lon nhat
        System.out.println("Tim hoa don co tong tien lon nhat");
        ArrayList<Invoice> listMax = listInv.findInvoicesMaxTotal();
        for (Invoice invoice : listMax) {
            System.out.println(invoice.format()+"\n");
        }
        
        //Tim hoa don khi biet ten khach hang
        System.out.println("Tim hoa don khi biet ten khach hang");
        if (listInv.findCustomerInvoice("Mai") == true) {
            System.out.println();
        } else {
            System.out.println("Khong co hoa don cua khach hang");
        }
        
    }
}
