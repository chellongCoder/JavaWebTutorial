/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManager;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Main {

    public static int menu() {
        System.out.println("========================");
        System.out.println("1. input");
        System.out.println("2. output");
        System.out.println("3. search");
        System.out.println("4: exxit");
        System.out.println("========================");
        System.out.println("choice> ");
        int choice = new Scanner(System.in).nextInt();
        return choice;
    }

    public static void main(String[] args) {
        LibraryManager lib = new LibraryManager();
        int choice;
        do {
            choice = menu();
            switch (choice) {
                case 1: {
                    System.out.println("1. Paper");
                    System.out.println("2. Book");
                    System.out.println("3. Thesis");
                    System.out.println("choice> ");
                    lib.input(new Scanner(System.in).nextInt());
                }
                break;
                case 2: {
                    lib.output();
                }
                break;

                case 3: {
                    System.out.println("1. Paper");
                    System.out.println("2. Book");
                    System.out.println("3. Thesis");
                    System.out.println("choice> ");
                    switch (new Scanner(System.in).nextInt()) {
                        case 1:
                            lib.Search(LibraryManager.Papers);
                            break;
                        case 2:
                            lib.Search(LibraryManager.Books);
                            break;
                        case 3:
                            lib.Search(LibraryManager.Thesises);
                            break;
                    }
                }
                break;
            }
        } while (true);
    }
}
