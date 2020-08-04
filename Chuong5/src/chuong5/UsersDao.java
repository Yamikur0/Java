/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class UsersDao {
    public void add(Users us) throws Exception {
        String sql = "insert into user values('" + us.getId() + "','" + us.getPass()+ "')";
        DataBaseUtil.setData(sql);
    }
    public void updateInStudenID(String newPassword, String userName) throws Exception {
        String sql = String.format("update user set password = '%s' where username = '%s'", newPassword,userName);
        DataBaseUtil.setData(sql);
    }
    public boolean logIn(Users us) throws Exception{
        String sql = "select password from user where username = '"+us.getId()+"'";
        ResultSet rs = DataBaseUtil.getData(sql);
        rs.next();
        return rs.getString(1).equals(us.getPass());
    }
}
