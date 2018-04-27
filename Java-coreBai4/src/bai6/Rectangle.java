/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author imac
 */
public class Rectangle {
    private double height, width;
    Scanner sc = new Scanner(System.in);
    public void inputSize() {
        System.out.println("nhap chieu dai> ");
        this.height = sc.nextDouble();
        System.out.println("nhap chieu rong: ");
        this.width = sc.nextDouble();
        
        
    }
    
    public double tinhDienTich() {
        return this.height * this.width;
    }
    
    public double tinhChuVi() {
        return (this.height+this.width)*2;
    }
 }
