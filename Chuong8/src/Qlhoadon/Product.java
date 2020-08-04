/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Qlhoadon;

/**
 *
 * @author Administrator
 */
public class Product {
    private String descriptuon;
    private double price;

    public String getDescriptuon() {
        return descriptuon;
    }

    public void setDescriptuon(String descriptuon) {
        this.descriptuon = descriptuon;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Product(){}
    
    public Product(String description, double price){
        this.descriptuon = description;
        this.price = price;
    }
}
