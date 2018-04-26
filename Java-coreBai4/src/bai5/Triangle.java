/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author imac
 */
public class Triangle {
   private double canhA, canhB, canhC;
   Scanner sc = new Scanner(System.in);
   public void inputEdge() {
       System.out.println("nhap canh a> ");
       this.canhA = sc.nextDouble();
       System.out.println("nhap canh b> ");
       this.canhB = sc.nextDouble();
       System.out.println("nhap canh c> ");
       this.canhC = sc.nextDouble();
       
   }
   
   public boolean checkKieuTamGiac () {
//       System.out.println("> " + this.canhA + this.canhB + this.canhC);
       if(this.canhA<this.canhB+this.canhC && this.canhB<this.canhA+this.canhC && this.canhC<this.canhB+this.canhA) {
           if(canhA==canhB || canhB==canhC || canhA==canhC) {
               System.out.println("tam giac can");
               return true;
           }
           else if(canhA==canhB && canhA==canhC && canhB==canhC) {
               System.out.println("tam giac deu");
               return true;
           }
           else if(canhA*canhA==canhB*canhB+canhC*canhC || canhB*canhB==canhA*canhA+canhC*canhC || canhC*canhC==canhB*canhB+canhA*canhA) {
               System.out.println("tam giac vuong");
               return true;
           } else {
               System.out.println("tam giac thuong");
               return true;
           }
       } else {
           System.out.println("khong phai tam giac");
           return false;
       }
   }
   
   
   public double chuViTamGiac() {
       return this.canhA + this.canhB + this.canhC;
   }
   
   public double dienTichTamGiac() {
       double chuViTamGiac = this.chuViTamGiac();
       return Math.sqrt(chuViTamGiac*(chuViTamGiac-this.canhA)*(chuViTamGiac-this.canhB)*(chuViTamGiac-this.canhC));
   }
}
