/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author chellong
 */
public class Main {
    public static void main(String[] args) {
        SoPhuc sp1 = new SoPhuc(2, 5);
        SoPhuc sp2 = new SoPhuc(1,3);
        SoPhuc spTong = new SoPhuc();
        spTong = spTong.tongSoPhuc(sp1, sp2);
        System.out.println("tong 2 so phuc: " + spTong.getPhanThuc() + "+" + spTong.getPhanAo()+"i");
        SoPhuc sp = new SoPhuc();
        System.out.println("hieu 2 so phuc: " + sp.hieuSoPhuc(sp1, sp2));
        System.out.println("tich 2 so phuc: " + sp.tichSoPhuc(sp1, sp2));
        System.out.println("thuong 2 sophuc: " + sp.thuongSoPhuc(sp1, sp2));
    }
}
