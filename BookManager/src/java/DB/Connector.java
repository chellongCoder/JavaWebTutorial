/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class Connector {
    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
          String url = "jdbc:mysql://localhost:3306/BookManager?autoReconnect=true&useSSL=false";
        String user = "root";
        String pass = "";
        return DriverManager.getConnection(url, user, pass);
    }
    
    public static void main(String[] args) {
        try {
            Connection conn = getConnection();
            if(conn!=null) System.out.println("ok");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
