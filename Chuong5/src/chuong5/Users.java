/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

/**
 *
 * @author Admin
 */
public class Users {
    private String id;
    private String pass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Users() {
    }

    public Users(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", pass=" + pass + '}';
    }
}
