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
public class Invoice {

    private String invoiceID;
    private Customer customer;
    private ArrayList<LineItem> items;

    public String getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<LineItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<LineItem> items) {
        this.items = items;
    }

    public Invoice(String invoiceID, Customer customer) {
        this.invoiceID = invoiceID;
        this.items = new ArrayList<>();
        this.customer = customer;
    }

    public void add(Product product, int quantity) {
        LineItem aItem = new LineItem(product, quantity);
        items.add(aItem);
    }

    public double getTotal() {
        double total = 0;
        for (LineItem item : items) {
            total += item.getAmount();
        }
        return total;
    }

    public String format() {
        String r = "\n-------------------------------------------------------------------"
                + "\nID:" + invoiceID + "\t\t\t    I N V O I C E\n"
                + "-------------------------------------------------------------------"
                + "\n\n" + customer.format()
                + "\n-------------------------------------------------------------------"
                + String.format("\n%-5s%14s%31s%5s%12s\n", "No", "Description", "Price", "Qty",
                        "Amount");

        for (int i = 0; i < items.size(); i++) {
            r += (i+1) + items.get(i).format() + "\n";
        }

        r = r + "-------------------------------------------------------------------";
        r = r + String.format("\nTotal: %,8.0f VND", getTotal());
        return r;
    }

}
