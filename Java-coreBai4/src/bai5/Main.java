/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author imac
 */
public class Main {
    public static void main(String[] args) {
        Triangle tamGiac = new Triangle();
        tamGiac.inputEdge();
    
        if(tamGiac.checkKieuTamGiac()) {
            System.out.println("chu vi tam giac: " + tamGiac.chuViTamGiac());
            System.out.println("dien tich tam giac: " + tamGiac.dienTichTamGiac());
        }
    }
}
