package com.java.spring.model;

import com.java.spring.bean.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class CustomerModel {
//    @Autowired
//    private DataSource dataSource;
    public  List<Customer> getAll(DataSource dataSource) throws Exception {
        List<Customer> list = new ArrayList<>();
        String sql = "SELECT * FROM CustomerManager.customer";
        PreparedStatement statement = dataSource.getConnection().prepareStatement(sql);
        ResultSet rs = statement.executeQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("");
        while(rs.next()) {
            Customer cus = new Customer(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getDate("dob"),
                    rs.getDouble("salary")
            );
            System.out.println("customer" + cus);
            list.add(cus);
        }
        return list;
    }
//
    public static int saveCustomer(Customer cust, DataSource dataSource) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String formatDate = sdf.format(cust.getDob());
        System.out.println("FORMAT DATE-----" + formatDate);
        String sql = "INSERT INTO customer (name, dob, salary) values (? , ? , ?)";
        PreparedStatement statement = dataSource.getConnection().prepareStatement(sql);
        statement.setString(1, cust.getName());
        statement.setString(2, sdf.format(cust.getDob()));
        statement.setDouble(3, cust.getSalary());
        return statement.executeUpdate();
    }

    public static Customer getCustomerById(int id, DataSource dataSource) throws Exception {
        String sql = "SELECT * FROM CUSTOMER WHERE customer.id=?";
        PreparedStatement statement = dataSource.getConnection().prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
        Customer cust = new Customer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while(rs.next()) {
            cust.setId(rs.getInt("id"));
            cust.setName(rs.getString("name"));
            cust.setDob(rs.getDate("dob"));
            cust.setSalary(rs.getDouble("salary"));
        }
        return cust;
    }
     public static int updateCustomer (Customer cust) throws Exception {
        return 0;
     }
}
