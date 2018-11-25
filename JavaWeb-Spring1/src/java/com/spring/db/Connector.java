
package com.spring.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    public static Connection getConnector() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String sql = "jdbc:mysql://localhost:3306/QuanLySinhVien?autoReconnect=true&useSSL=false";
        String user = "root";
        String pass = "";
        return DriverManager.getConnection(sql, user, pass);
    }
    
    public static void main(String[] args) throws Exception {
        Connection conn = getConnector();
        if(conn!=null) System.out.println("ok");
    }
}
