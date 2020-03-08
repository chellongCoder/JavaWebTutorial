/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chellong
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static boolean ktraSoNguyenTo(int n) {
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            if(n%i==0) {
                count ++;
            }
        }
        
        if(count == 2) {
            return true;
        }
        return false;
    }
    public static boolean ktraSoNguyenTo2(int n) {
        if(n==0 || n==1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0) {
                    return false;
                }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            // TODO code application logic here
//            System.out.println("Nhap so nguyen to: ");
//            Scanner out = new Scanner(System.in);
//            int number = out.nextInt();
//            boolean check = Main.ktraSoNguyenTo(number);
//            if(check) {
//                System.out.println(number + " la so nguyen to.");
//            } else {
//                System.out.println(number +  " khong phai so nguyen to ");
//            }
//            
//            int docFile = Integer.parseInt(Main.docFile());
//            System.out.println("docfile " + docFile);
//            int i = 0;
//            int dem = 0;
//            int sum = 0;
//            while (true) {                
//                if(Main.ktraSoNguyenTo2(i)) {
//                    System.out.println(i+", ");
//                    sum = sum + i;
//                    dem++;
//                }
//                i++;
//                if(dem==docFile)  break;
//            }
//            System.out.println("sum = " + sum);
//                double i = 10%Math.sqrt(10);
//                System.out.println("i = " + i);
//            Main.eratosthenes(100);
            File f = new File("TEST.INP");
//            Main.readFileScanner(f);
            FileReader reader = new FileReader(f);
            int i;
            while ((i = reader.read()) != -1) {                
                System.out.println("content " + (char)i);
            }
            String data = new String(Files.readAllBytes(Paths.get("TEST.INP"))); 
            System.out.println("data " + data);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static void readFileScanner(File path) throws FileNotFoundException {
        Scanner out = new Scanner(path);
        System.out.println("content " +  out.next());
    }
    
    public static void eratosthenes (int n) {
        boolean[] array = new boolean[n+1];
        int count = 0;
        int num = 0;
        for (int i = 2; i <= n; i++) {
            array[i] = false;
//            System.out.println(array[i]);
        }
        
        for (int i = 2; i <= n; i++) {
            if(!array[i]) {
                System.out.println(i + " ");
            }
            count = 2;
            while((num=i*count) <= n) {
                array[num] = true;
                count++;
            }
        }
    }
    
    public static String docFile() throws Exception {
            File f = new File("DATA.INP");
            if(!f.exists()) f.createNewFile();
            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";

            System.out.println("Reading file using Buffered Reader");

            while ((readLine = b.readLine()) != null) {
                System.out.println(readLine);
                return readLine;
            }

       
        return readLine;
    }
    
    
}
