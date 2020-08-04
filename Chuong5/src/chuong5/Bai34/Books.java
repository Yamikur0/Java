/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5.Bai34;

/**
 *
 * @author Admin
 */
public class Books {
    private int id;
private String title;
private String author;
private double price;
private int qty;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Books() {
    }

    public Books(int id, String title, String author, double price, int qty) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "\nBooks{" + "id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", qty=" + qty + '}';
    }
}
