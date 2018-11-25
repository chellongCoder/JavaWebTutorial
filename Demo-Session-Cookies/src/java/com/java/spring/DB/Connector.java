/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spring.DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author chellong
 */
public class Connector {
    public static Connection getConnection () throws Exception {
        String url = "jdbc:mysql://localhost:3306/DemoAuthentication?autoReconnect=true&useSSL=false";
        Class.forName("com.mysql.cj.jdbc.Driver");
        String username = "root";
        String password = "";
        return DriverManager.getConnection(url, username, password);
    }
}
