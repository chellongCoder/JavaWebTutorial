/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

/**
 *
 * @author imac
 */
public class Main {
    public static void main(String[] args) {
        Rectangle hinhChuNhat = new Rectangle();
        hinhChuNhat.inputSize();
        System.out.println("dien tich hinh chu nhat> " + hinhChuNhat.tinhDienTich());
        System.out.println("chu vi hinh chu nhat> " + hinhChuNhat.tinhChuVi());
    }
}
