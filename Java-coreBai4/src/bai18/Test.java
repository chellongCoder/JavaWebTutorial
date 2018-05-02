/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Test {
    static Scanner sc = new Scanner(System.in);
    public static int menu() {
        System.out.println("============================");
        System.out.println("1. add new product");
        System.out.println("2. remove product ");
        System.out.println("3. interate product list");
        System.out.println("4. search product");
        System.out.println("5. Exit");
        System.out.println("============================");
        int choice;
        System.out.print("chon> ");
        choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public static void main(String[] args) {
        int choice;
        Shop shop = new Shop();
        do {
            choice = menu();
            switch(choice) {
                case 1: shop.addProduct();break;
                case 2: shop.removeProduct();break;
                case 3: shop.interateProduct();break;
                case 4: shop.searchProduct();break;
                case 5: System.exit(0);break;
            default: System.out.println("moi ban nhap lai!");
            }
        }while(true);
    }
}
