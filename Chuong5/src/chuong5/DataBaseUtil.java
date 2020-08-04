/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuong5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
/**
 *
 * @author Administrator
 */
public class DataBaseUtil {
    public static Connection c;
    private static String db_url = "jdbc:mysql://localhost:3308/studentdb?characterEncoding=latin1&useConfigs=maxPerformance";
    private static String username = "root";
    private static String password = "";
    
    public static Connection getConnection() throws Exception{
        if (c == null) {
            c = DriverManager.getConnection(db_url, username, password);
        }
        return c;
    }
    
    public static int setData(String sql) throws Exception{
        return DataBaseUtil.getConnection().createStatement().executeUpdate(sql);
    }
    
    public static ResultSet getData(String sql) throws Exception{
        ResultSet rs = DataBaseUtil.getConnection().createStatement().executeQuery(sql);
        return rs;
    }
}
