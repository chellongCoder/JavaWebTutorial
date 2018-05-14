/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreManager;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Main {

    public static int menu() {
        System.out.println("1. add product");
        System.out.println("2. list product");
        System.out.println("3. search");
        System.out.println("4. exit");
        System.out.println("===========================");
        System.out.println("nhaplua chon> ");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        return choice;
    }

    public static void main(String[] args) {
        Store store = new Store();
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    store.addProduct();
                    break;
                case 2:
                    store.listProduct();
                    break;
                case 3: 
                    store.search();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
