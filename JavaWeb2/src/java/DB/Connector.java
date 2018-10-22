/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author chellong
 */

import java.sql.Connection;
import java.sql.DriverManager;
public class Connector {
    
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/QuanLySinhVienJavaWeb?autoReconnect=true&useSSL=false";
        String user = "root";
        String pass = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }
    
    public static void main(String[] args) throws Exception {
        Connection conn = getConnection();
        if(conn!=null) {
            System.out.println("ket noi thanh cong");
        } else {
            System.out.println("ket noi that bai");
        }
    }
}