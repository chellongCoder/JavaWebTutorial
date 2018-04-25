/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author imac
 */
public class Student {
    private String msv;
    private double dtb;
    private int age;
    private String lop;

    public Student() {
    }

    public Student(String msv, double dtb, int age, String lop) {
        this.msv = msv;
        this.dtb = dtb;
        this.age = age;
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public boolean isMsv(String msv) {
        return msv.length()==8 ? true : false;
    }
    
    public boolean isDtb(double dtb) {
        return (dtb>=0.0 && dtb<=10.0) ? true : false;
    }
    
    public boolean isAge(int tuoi) {
        return (tuoi>0 && tuoi<=18) ? true : false;
    }
    
    public boolean isLop(String lop) {
        return (lop.startsWith("A") || lop.startsWith("C")) ? true : false;
    }
            
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("nhap msv> ");
            this.msv = sc.nextLine();
        }while(!isMsv(this.msv));
        do {
            System.out.print("nhap dtb> ");
            this.dtb = Double.parseDouble(sc.nextLine());
        }while(!isDtb(this.dtb));
        do {
            System.out.print("nhap tuoi> ");
            this.age = Integer.parseInt(sc.nextLine());
        }while(!isAge(this.age));
        do {
            System.out.print("nhap lop> ");
            this.lop = sc.nextLine();
        }while(!isLop(this.lop));
    }
    
    public void showInfo() {
        System.out.println("=========================================");
        System.out.printf("%-30s | %-20s | %-20s | %-20s | %-20s\n", "msv", "dtb", "tuoi", "lop", "hoc bong");
        System.out.println("=========================================");
        System.out.printf("%-30s | %-20.2f | %-20d | %-20s | %-20s \n", this.msv, this.dtb, this.age, this.lop, tinhHocBong());
        System.out.println("=========================================");
    }
    
    public String tinhHocBong() {
        return this.dtb>8.0 ?  "co" :  "khong";
    }
}
