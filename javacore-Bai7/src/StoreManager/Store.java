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
public class Store {
    private Product[] products;
    public static final int MAX = 100;
    private int index = 0;
    public Store() {
        products = new Product[MAX];
    }
    
    public void addProduct() {
        System.out.println("============add new============");
        System.out.println("1. SmartPhone");
        System.out.println("2. Camera");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        switch(choice) {
            case 1: {
                Product p = new SmartPhone();
                p.addNew();
                products[index++] = p;
            }break;
            case 2: {
                Product cam = new Camera();
                cam.addNew();
                products[index++] = cam;
            }
        }
    }
    
    public void listProduct() {
        System.out.println("==============SmartPhone===============");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s\n", "idProduct", "nameProduct", "price", "quantity", "hasCamera", "idSim");
        for (int i = 0; i < index; i++) {
            if(products[i] instanceof SmartPhone) {
                System.out.println("|  "+products[i] + "  |");
            }
        }
        System.out.println("==============Camera===================");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "idProduct", "nameProduct", "price", "quantity", "hasWifi");
        for (int i = 0; i < index; i++) {
            if(products[i] instanceof Camera) {
                System.out.println("|  "+products[i] + "  |");
            }
        }
    }
    public void search() {
        System.out.println("input name searched: ");
        String name = new Scanner(System.in).nextLine();
        boolean check = false;
        for (int i = 0; i < index; i++) {
            if(products[i].getName().equalsIgnoreCase(name)) {
                check = true;
                if(products[i] instanceof SmartPhone) {
                    System.out.println("SmartPhone: " + products[i]);
                }
                if(products[i] instanceof Camera) {
                    System.out.println("Camera: " + products[i]);
                }
            }
        }
        if(!check) {
            System.out.println("item ["+name+"] not found!");
        }
    }
    
}
