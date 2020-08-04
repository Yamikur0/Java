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
public class LineItem {
    private int quantity;
    private Product product;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public LineItem(){}
    
    public LineItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;        
    }
    
    public double getAmount(){
        return product.getPrice()*quantity;
    }
    
    public String format(){
        return  String.format("\t%-30s%,12.0f%5d%,12.0f", product.getDescriptuon(),
         product.getPrice(), quantity, getAmount());
    }
}
