/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Fraction ps1 = new Fraction();
        System.out.println("nhap phan so> ");
        ps1.inputFraction();
        System.out.println("phan so vua nhap> ");
        ps1.showFraction();
        System.out.println("phan so sau khi rut gon> ");
        ps1 = ps1.rutGonPhanSo();
        ps1.showFraction();
//        System.out.println("nghich dao cua phan so> ");
//        ps1 = ps1.nghichDaoPhanSo();
//        ps1.showFraction();
        System.out.println("=============================");
        System.out.println("nhap phan so> ");
        Fraction ps2 = new Fraction();
        ps2.inputFraction();
        System.out.println("phan so vua nhap> ");
        ps2.showFraction();
        System.out.println("phan so sau khi rut gon> ");
        ps2 = ps2.rutGonPhanSo();
        ps2.showFraction();
//        System.out.println("nghich dao cua phan so> ");
//        ps1 = ps1.nghichDaoPhanSo();
//        ps1.showFraction();
        System.out.println("=============================");
        Fraction phanSo = new Fraction();
        System.out.println("tong 2 phan so> ");
        phanSo.tong2PhanSo(ps1, ps2).showFraction();
        System.out.println("tich 2 phan so: ");
        phanSo.nhan2PhanSo(ps1, ps2).showFraction();
        System.out.println("hieu 2 phan so: ");
        phanSo.hieu2PhanSo(ps1, ps2).showFraction();
        System.out.println("thuong 2 phan so: ");
        phanSo.chia2PhanSo(ps1, ps2).showFraction();
    }
}
