/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5.Bai34;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLSach {

    public ArrayList<Books> getAllBooks() throws Exception {
        String sql = "select * from books";
        ResultSet rs = DataBaseUtil.getData(sql);
        ArrayList<Books> bks = new ArrayList<>();

        while (rs.next()) {
            int id = rs.getInt(1);
            String title = rs.getString(2);
            String author = rs.getString(3);
            double price = rs.getDouble(4);
            int qty = rs.getInt(5);
            bks.add(new Books(id, title, author, price, qty));
        }

        return bks;
    }
    public void add(Books eb) throws Exception {
        int id = eb.getId();
        String title = eb.getTitle();
        String author = eb.getAuthor();
        double price = eb.getPrice();
        int qty = eb.getQty();
        String sql = "insert into books values(" + id + ",'" + title + "','" + author + "'," + price + "," + qty + ")";
        DataBaseUtil.setData(sql);
    }

    public void tangGiaSach() throws Exception {
        String sql = "select * from books where title='A Cup of Java'";
        ResultSet rs = DataBaseUtil.getData(sql);
        float price = 0;
        while (rs.next()) {
            price = rs.getFloat(4) + rs.getFloat(4) * (float) 0.5;
        }
        String sql1 = "update books set price=" + price + "where title='A Cup of Java'";
        DataBaseUtil.setData(sql1);
    }

    public void thayDoiSL() throws Exception {
        String sql = "update books set qty=0 where title='A teaspoon of Java'";
        DataBaseUtil.setData(sql);

    }

    public void delete() throws Exception {
        String sql = "delete from books where id>6000";
        DataBaseUtil.setData(sql);
    }

    public void insert() throws Exception {
        String sql = "insert into books values(6001,'JavaABC','Mr Author',15.55,55)";
        String sql1 = "insert into books values(8002,'JavaXYZ','Mr Author',25.55,55)";
        DataBaseUtil.setData(sql);
        DataBaseUtil.setData(sql1);
    }
}
