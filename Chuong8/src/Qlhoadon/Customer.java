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
public class Customer {
    private String name;
    private String telephone;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Customer(){}
    
    public Customer(String name, String telephone, String address){
        this.name = name;
        this.telephone = telephone;
        this.address = address;
    }
    
    public String format() {
        return  name + "\n" + telephone + "\n" + address;
    }
}
