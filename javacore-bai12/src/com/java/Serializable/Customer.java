/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Serializable;

import java.io.Serializable;

/**
 *
 * @author chellong
 */
public class Customer implements Serializable {
    private int id;
    private String name;
    private String address;
    private int age;

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Custommer{" + "id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + '}';
    }
    
    
    
}
