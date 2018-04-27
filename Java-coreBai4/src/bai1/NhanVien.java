/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author imac
 */
public class NhanVien {
    private String name;
    private int age;
    private String address;
    private double salary;
    private int hours;

    public NhanVien() {
    }

    public NhanVien(String name, int age, String address, double salary, int hours) {
        this.name = name;
        this.age = age;    
        this.address = address;
        this.salary = salary;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHour() {
        return hours;
    }

    public void setHour(int hours) {
        this.hours = hours;
    }
    
    
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten> ");
        this.name = sc.nextLine();
        System.out.print("nhap tuoi> ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.print("nhap tien luong> ");
        this.salary = Float.parseFloat(sc.nextLine());
        System.out.print("nhap so gio lam> ");
        this.hours = Integer.parseInt(sc.nextLine());
    }
    
    public void printInfo() {
        System.out.println("=========================================");
        System.out.printf("%-30s | %-20s | %-20s | %-20s | %-20s\n", "name", "age", "salary", "hours", "thuong");
        System.out.println("=========================================");
        System.out.printf("%-30s | %-20d | %-20.2f | %-20d | %-20.2f \n", this.name, this.age, this.salary, this.hours, tinhThuong());
        System.out.println("=========================================");
    }
    
    public double tinhThuong() {
        System.out.println("hours = " + this.hours);
        double thuong=0;
        if(this.hours>=200) {
            thuong = this.salary*((double)20/100);
        }
        if(this.hours<200 && this.hours>=100) {
            thuong = this.salary*((double)10/100);
        }
        return thuong;
    }
}
