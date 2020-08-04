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
public class InvoiceManage {
    private ArrayList<Invoice> invoiceList;

    public ArrayList<Invoice> getInvoiceList() {
        return invoiceList;
    }

    public void setInvoiceList(ArrayList<Invoice> invoiceList) {
        this.invoiceList = invoiceList;
    }
    
    public InvoiceManage(){
        this.invoiceList = new ArrayList<>();
    }
    
    public void add(Invoice inv){
        invoiceList.add(inv);
    }
    
    public boolean remove(String invoiceID) {
        if (invoiceID == null) {
            return false;
        }
        for (int i = 0; i < invoiceList.size(); i++) {

            if (invoiceID.equals(invoiceList.get(i).getInvoiceID())) {
                invoiceList.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Invoice> findInvoicesMaxTotal() {
        double max = invoiceList.get(0).getTotal();
        ArrayList<Invoice> rs = new ArrayList<>();
        for (int i = 1; i < invoiceList.size(); i++) {
            if (invoiceList.get(i).getTotal() > max) {
                max = invoiceList.get(i).getTotal();
            }
        }
        for (int i = 0; i < invoiceList.size(); i++) {
            if (invoiceList.get(i).getTotal() == max) {
                rs.add(invoiceList.get(i));
            }
        }
        return rs;
    }

    public boolean findCustomerInvoice(String name) {
        if (name == null) {
            return false;
        }
        for (int i = 0; i < invoiceList.size(); i++) {
            if (name.equals(invoiceList.get(i).getCustomer().getName())) {
                System.out.println("Tim thay hoa don khach hang");
                System.out.println(invoiceList.get(i).format());
                return true;
            }
        }
        return false;
    }
    
    public String format() {
        String s = "";
        for (int i = 0; i < invoiceList.size(); i++) {
            s += invoiceList.get(i).format() + "\n";
        }
        return s;
    }
}
