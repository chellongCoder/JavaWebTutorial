/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.model;

import com.spring.bean.Student;
import com.spring.db.Connector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    public static List<Student> getAll() throws Exception {
         List<Student> list = new ArrayList<>();
         Connection conn = Connector.getConnector();
         String sql = "SELECT * FROM QuanLySinhVien.SinhVien";
        PreparedStatement prepareStatement = conn.prepareStatement(sql);
         ResultSet rs = prepareStatement.executeQuery();
//         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
         while(rs.next()) {
             Student stud = new Student(
                     rs.getInt("id"), 
                     rs.getString("name"), 
                     rs.getString("class"), 
                     rs.getString("dob"));
             list.add(stud);
         }
         return list;
    }
    
    public static int add (Student stud) throws Exception {
        String sql = "INSERT INTO QuanLySinhVien.SinhVien(name, class, dob) values(?,?,?)";
        PreparedStatement statement = Connector.getConnector().prepareStatement(sql);
//        statement.setInt(1, stud.getId());
        statement.setString(1, stud.getName());
        statement.setString(2, stud.getLop());
        statement.setString(3, stud.getDob());
        return statement.executeUpdate();
    }
}
 