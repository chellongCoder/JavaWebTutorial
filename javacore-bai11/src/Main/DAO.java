/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class DAO {

    static Scanner sc = new Scanner(System.in);
    public static final String path = "/home/chellong/GIT/JavaWebTutorial/javacore-bai11";

    public static void duyetFile() {
        System.out.println("nhap vao duong dan folder> ");
        String path = sc.nextLine();
        File file = new File(path);
        if (!file.exists()) {
            System.out.println("file khong ton tai");
            return;
        }
        File[] listFile = file.listFiles();
        System.out.println("danh sach file> ");
        for (int i = 0; i < listFile.length; i++) {
            System.out.println(listFile[i].getName());
        }
    }

    public static void deleteFile() {
        System.out.println("nhap vao ten file can xoa> ");
        String fileName = sc.nextLine();
        File file = new File(path + "/" + fileName);
        try {
            if(file.delete()) {
                System.out.println("xoa file thanh cong");
            }
        } catch (Exception e) {
            System.out.println("loi> " + e.getMessage());
        }
    }

    public static void taoFile() {
        String fileName;
        System.out.println("nhap ten file cantao> ");
        fileName = sc.nextLine();
        try {
            File file = new File(path +"/"+ fileName);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("tao file thanh cong");
                    System.out.print("nhap noi dung file> ");
                    PrintWriter pw = new PrintWriter(file);
                    pw.println(sc.nextLine());
                    pw.flush();
                    pw.close();
                }
            } else {
                System.out.println("file da ton tai!");
                return;
            }
        } catch (Exception e) {

        }
    }
    
    public static void doiTenFile() {
        System.out.println("nhap ten file can doi> ");
        String fileName = sc.nextLine();
        File file = new File(path+ "/" +fileName);
        String format = fileName.substring(fileName.indexOf("."), fileName.length());
        System.out.println("nhap ten file moi> ");
        
        if(file.renameTo(new File(path+"/"+sc.nextLine()+format))) {
            System.out.println("doi ten file thanh cong!");
        }
    }
}
