/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;

/**
 *
 * @author chellong
 */
public class Main {
    public static void main(String[] args) {
        Connection conn = DatabaseConnection.connectDatabase();
        if(conn!=null) {
            System.out.println("connect suscess");
        } else {
            System.out.println("connect failure");
        }
        System.out.println("select");
       DatabaseConnection.select();
        System.out.println("insert ");
//        DatabaseConnection.insert();
        System.out.println("delete");
//        DatabaseConnection.delete();
        System.out.println("update");
//            DatabaseConnection.update();
    }
}
