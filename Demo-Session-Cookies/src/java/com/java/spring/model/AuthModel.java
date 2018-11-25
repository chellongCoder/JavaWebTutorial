/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.spring.model;

import com.java.spring.DB.Connector;
import com.java.spring.bean.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author chellong
 */
public class AuthModel {
    public static boolean auth (User user) {
        try {
            System.out.println("=======User" + user);
            String sql = "Select * from USER where username=? and password = ?";
            PreparedStatement statement = Connector.getConnection().prepareStatement(sql);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            ResultSet rs = statement.executeQuery();
            return rs.next();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            return false;
        
    }
}
