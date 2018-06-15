/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Util {
    public static int Menu() {
        System.out.println("==============================");
        System.out.println("1. duyet file");
        System.out.println("2. xoa file");
        System.out.println("3. tao file");
        System.out.println("4. doi ten file");
        System.out.println("5. thoat");
        System.out.println("==============================");
        System.out.println("chon> ");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        return choice;
        
    }
}
