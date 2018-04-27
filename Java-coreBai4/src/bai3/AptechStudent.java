/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author imac
 */
public class AptechStudent {
    Scanner sc = new Scanner(System.in);
    public boolean isHDSE() {
        System.out.println("co dang ki khoa hoc HDSE khong?");
        String str = "";
        do {
            System.out.println("nhap co hoac khong> ");
            str = sc.nextLine();
        }while(!(str.equals("co") || str.equals("khong")));
        return str.equals("co") ? true : false;
    }
    
    public boolean isDiemTongKet() {
        System.out.println("diem tb co > 75% khong? ");
        String str = "";
        do {
            System.out.println("nhap co hoac khong> ");
            str = sc.nextLine();
        }while(!(str.equals("co") || str.equals("khong")));
        return str.equals("co") ? true : false;
    }
    
    public boolean isViPhamNoiQuy() {
        System.out.println("co vi pham noi quy khong? ");
        String str = "";
        do {
            System.out.println("nhap co hoac khong> ");
            str = sc.nextLine();
        }while(!(str.equals("co") || str.equals("khong")));
        return str.equals("co") ? false : true;
    }
    
    public boolean isCacKyThi() {
        System.out.println("cac ki thi chi thi lan dau tien phai khong? ");
        String str = "";
        do {
            System.out.println("nhap dung hoac sai> ");
            str = sc.nextLine();
        }while(!(str.equals("dung") || str.equals("sai")));
        return str.equals("dung") ? true : false;
    }
    
    public void checkHocBong() {
        if(isHDSE() && isDiemTongKet() && isViPhamNoiQuy() && isCacKyThi()) {
            System.out.println("da nhan hoc bong");
        } else {
            System.out.println("khong dc nhan hoc bong");
        }
    }
}
