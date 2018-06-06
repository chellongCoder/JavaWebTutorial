/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDemo;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class StudentManager {
    private Student[] list;
    private int index=0;
    public static final int MAX=100;

    public StudentManager() {
        list = new Student[MAX];
    }
    
    public void addStudent() {
        do {            
            System.out.println("==========nhap sinh vien==========");
            Student stud = new Student();
            stud.inputInfo();
            list[index++] = stud;
            System.out.println("ban co muon nhap them khong? (y or n)");
            String check = new Scanner(System.in).nextLine();
            if(check.equals("n")) break;
        } while (true);
    }
    
    public void show() {
        System.out.println("===========danh sach sinh vien==========");
        for(Student stud : list) {
            System.out.println(stud);
            if(stud==null) return;
        }
    }
}
