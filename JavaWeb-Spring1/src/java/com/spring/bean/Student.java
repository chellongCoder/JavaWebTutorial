/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.bean;

import java.util.Date;

/**
 *
 * @author chellong
 */
public class Student {
    private int id;
    private String name;
    private String lop;
    private String dob;

    public Student() {
    }

    public Student(int id, String name, String lop, String dob) {
        this.id = id;
        this.name = name;
        this.lop = lop;
        this.dob = dob;
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

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", lop=" + lop + ", dob=" + dob + '}';
    }

    
    
    
}
