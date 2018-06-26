/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class CustomerManager {
    public static final String fileName="cus.dat";
    private List<Customer> listCustomer;
    private Scanner sc = new Scanner(System.in);
    
    public CustomerManager() {
        listCustomer = new ArrayList<>();
    }
    
    public boolean load (String fileName) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            List<Customer> listCustomer = (List<Customer>)ois.readObject();
            if(listCustomer==null) {
                System.out.println("danh sach rong!");
                return false;
            }
            this.listCustomer = listCustomer;
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }
    
    public void add () { 
        Customer cus = new Customer();
        System.out.println("nhap id> ");
        cus.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("nhap ten> ");
        cus.setName(sc.nextLine());
        System.out.println("nhap dia chi> ");
        cus.setAddress(sc.nextLine());
        System.out.println("nhap tuoi> ");
        cus.setAge(Integer.parseInt(sc.nextLine()));
        if (listCustomer.add(cus)) {
            System.out.println(">>>>them thanh cong<<<<");
            return;
        } 
        System.err.println(">>>>them that bai<<<<");
    }
    
    public Customer search(int id)  {
        boolean flag = false;
        for (Customer customer : listCustomer) {
            if(customer.getId()==id) {
                return customer;
            }
        }
        return null;
    }
    
    public boolean save() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            if(listCustomer.size()==0) {
                System.out.println("danh sach chua co gi!");
                return false;
            }
            oos.writeObject(listCustomer);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            return false;
        }
        return true;
    }
    
}
