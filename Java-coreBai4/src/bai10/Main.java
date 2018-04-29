/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

/**
 *
 * @author chellong
 */
public class Main {
    public static void main(String[] args) {
        DaThuc dathuc1 = new DaThuc();
        dathuc1.nhapDaThuc();
        System.out.println("da thuc vua nhap> " + dathuc1);
        DaThuc dathuc2 = new DaThuc();
        dathuc2.nhapDaThuc();
        System.out.println("da thuc vua nhap> " + dathuc2);
        DaThuc dathuc = new DaThuc();
        System.out.println("tong 2 da thuc la> " + dathuc.tong2DaThuc(dathuc1, dathuc2));
    }
}
