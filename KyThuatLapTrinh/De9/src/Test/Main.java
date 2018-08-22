/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.Dat;
import DAO.LoaiDat;
import DAO.LoaiNha;
import DAO.Nha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class Main {
    public static Scanner sc;
    public static SimpleDateFormat format;
    public static int Menu() {
        System.out.println("1. chon 1 de nhap va tinh tien mua nha");
        System.out.println("2. chon 3 de nhap va tinh tien mua dat");
        System.out.println("3. ket thuc");
        System.out.println("=====================================");
        System.out.println("chon> ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public static Nha nhapThongTinNha() {
        Nha nha = new Nha();
        System.out.println("nhap dien tich nha> ");
        nha.setDienTich(Double.parseDouble(sc.nextLine()));
        System.out.println("nhap don gia nha> ");
        nha.setDonGia(Double.parseDouble(sc.nextLine()));
        System.out.println("nhap dia chi nha> ");
        nha.setDiaChi(sc.nextLine());
        System.out.println("nhap ngay giao dich nha> ");
        try {
            nha.setNgayGiaoDich(format.parse(sc.nextLine()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        System.out.println("nhap loai nha> ");
        nha.setLoaiNha(sc.nextLine().toLowerCase().equals("chung cư") ? LoaiNha.chungCu : LoaiNha.bietThu);
        return nha;
    }
    public static Dat nhapThongTinDat() {
        Dat dat = new Dat();
        System.out.println("nhap dien tich dat> ");
        dat.setDienTich(Double.parseDouble(sc.nextLine()));
        System.out.println("nhap don gia dat> ");
        dat.setDonGia(Double.parseDouble(sc.nextLine()));
        System.out.println("nhap dia chi dat> ");
        dat.setDiaChi(sc.nextLine());
        System.out.println("nhap ngay giao dich dat> ");
        try {
            dat.setNgayGiaoDich(format.parse(sc.nextLine()));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        System.out.println("nhap loai dat> ");
        switch (sc.nextLine()) {
            case "A":
                dat.setLoaiDat((LoaiDat.A));
                break;
            case "B": 
                dat.setLoaiDat((LoaiDat.B));
                break;
            case "C":
                dat.setLoaiDat((LoaiDat.C));
                break;
            default:
        }
        return dat;
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        format = new SimpleDateFormat("dd/MM/yyyy");
        int choice;
        do {            
            choice = Menu();
            switch (choice) {
                case 1:
                    Nha nha = nhapThongTinNha();
                    System.out.println("thanh tien: " + nha.tinhTien());
                    break;
                case 2: 
                    Dat dat = nhapThongTinDat();
                    System.out.println("thanh tien: " + dat.tinhTien());
                    break;
                default:
                    System.out.println("nhap sai lenh!");
                    break;
            }
        } while (true);
    }
}
