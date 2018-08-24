/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class SoNguyenTo {
    static Scanner sc;
    static int Number;
    static int Menu() {
        System.out.println("1. nhap so");
        System.out.println("2. tim so nguyen to dung vong lap");
        System.out.println("3. tim so nguyen to su dung de quy");
        System.out.println("chon> ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        sc = new Scanner(System.in);
        int choice;
        do {            
            choice = Menu();
            switch(choice) {
                case 1: 
                    nhapSoNguyenTo();
                    break;
                case 2: 
                    suDungVongLap();
                    break;
                case 3: 
                    suDungDeQuy(Number);
                    break;
            }
        } while (true);
    }

    private static void suDungVongLap() {
        int dem = 0;
        for (int i = 0; i < Number; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%j==0) {
                    dem++;
                }
            }
            if(dem==2) {
                System.out.print(i);
            }
        }
    }

    private static void nhapSoNguyenTo() {
        System.out.println("nhap so nguyen to");
        Number = Integer.parseInt(sc.nextLine());
    }

    private static boolean kiemTraSoNguyenTo(int so, int i){
        //int i=2;
        if(i==so) return true;
        if(so%i==0) return false;
        return kiemTraSoNguyenTo(so,i+1);
    }
    
    private static void suDungDeQuy(int so) {
        if(so==1){
            System.out.println("1 ");
            return;
        }
        if(kiemTraSoNguyenTo(so, 2)) {
            System.out.println(so + " ");
        }
        suDungDeQuy(so - 1);
    }
    
}
