/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Serializable;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Main {

    public static int menu() {
        System.out.println("============================");
        System.out.println("1. load data");
        System.out.println("2. add new ");
        System.out.println("3. search");
        System.out.println("4. save");
        System.out.println("5. exit");
        System.out.println("============================");
        System.out.println("chon> ");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        return choice;
    }
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();
        int choice;
        do {            
            choice = menu();
            switch(choice) {
                case 1: {
                    if(manager.load(CustomerManager.fileName)) {
                        System.out.println("load file thanh cong@@@");
                    }
                }break;
                case 2: manager.add();break;
                case 3: {
                    System.out.println("nhap id> ");
                    Customer cus = manager.search(Integer.parseInt(new Scanner(System.in).nextLine()));
                    if(cus!=null) {
                        System.out.println("tim thay!");
                        System.out.println(cus);
                    }else {
                        System.out.println("khong tim thay");
                    }
                }break;
                case 4: {
                    if(manager.save()) {
                        System.out.println("luu file thanh cong!");
                    }else {
                        System.out.println("luu file that bai!");
                    }
                }break;
                case 5: System.exit(0); break;
                default: System.out.println("moi ban nhap lai!");
            }
        } while (true);
    }
    
}
