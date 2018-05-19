/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaHinh;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("==============================");
        System.out.println("1. tinh dien tich hinh chu nhat");
        System.out.println("2. tinh dien tich hinh vuong");
        System.out.println("3. tinh dien tich hinh tam giac");
        System.out.println("4. thoat");
        System.out.println("==============================");
        System.out.println("chon> ");
        int choice = sc.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        int choice;
        Util util = new Util();
        do {
            choice = menu();
            switch (choice) {
                case 1: {
                    System.out.println("nhap chieu rong: ");
                    double width = sc.nextDouble();
                    System.out.println("nhap chieu dai: ");
                    double height = sc.nextDouble();
                    Reactangle rec = new Reactangle(width, height);
                    System.out.println("dien tich hinh chu nhat> " + util.calculateArea(rec));
                }
                break;
                case 2: {
                    System.out.println("nhap canh: ");
                    double edge = sc.nextDouble();
                    Square square = new Square(edge);
                    System.out.println("dien tich hinh vuong> " + util.calculateArea(square));
                }
                case 3: {
                    System.out.println("nhap canh a, b, c: ");
                    double canhA, canhB, canhC;
                    do {
                        canhA = sc.nextDouble();
                        canhB = sc.nextDouble();
                        canhC = sc.nextDouble();
                        if ((canhA + canhB > canhC) && (canhA + canhC > canhB) && (canhB + canhC > canhA)) {
                            
                            break;
                        }
                        System.out.println("nhap lai 3 canh: ");
                    } while (true);
                    Triagle tri = new Triagle(canhA, canhB, canhC);
                    System.out.println("dien tich hinh tam giac> " + util.calculateArea(tri));
                }
                break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("moi nhap lai!");
            }
        } while (true);
    }
}
