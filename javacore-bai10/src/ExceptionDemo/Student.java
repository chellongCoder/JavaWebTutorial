/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDemo;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Student {
    private String maHV;
    private double diemTongKet;
    private String xepLoai;

    public Student() {
    }

    public Student(String maHV, double diemTongKet, String xepLoai) {
        this.maHV = maHV;
        this.diemTongKet = diemTongKet;
        this.xepLoai = xepLoai;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    @Override
    public String toString() {
        return "Student{" + "maHV=" + maHV + ", diemTongKet=" + diemTongKet + ", xepLoai=" + xepLoai + '}';
    }
    
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        
        do {            
            System.out.println("nhap ma sinh vien> ");
            this.maHV = sc.nextLine();
        } while (!Util.checkMaSV(this.maHV));
        
        do {            
            System.out.println("nhap diem tong ket> ");
            boolean check;
            do {                
                try {
                    check= true;
                    this.diemTongKet = Double.parseDouble(sc.nextLine());
                } catch (Exception e) {
                    check = false;
                    System.out.println("nhap sai dinh dang! Nhap lai!");
                }
            } while (!check);
        } while (!Util.checkDiemTongKet(this.diemTongKet));
        this.xepLoai = xepLoai(this.diemTongKet);
    }
    
    public String xepLoai(double diem) {
        if(diem<4) {
            return "kem";
        }else if(diem>=4 && diem<6) {
            return "trung binh";
        }else if(diem>=6 && diem<8) {
            return "kha";
        }else {
            return "gioi";
        }
    }
}
