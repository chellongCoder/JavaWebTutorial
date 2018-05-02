/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17.cau2;

import bai17.cau1.MyPoint;

/**
 *
 * @author chellong
 */
public class MyCircle {
    private MyPoint tam;
    private int r;
    
    public MyCircle(int x, int y, int r) {
        tam.setXY(x, y);
        this.r = r;
    } 
    
    public MyCircle(MyPoint tam, int r) {
        this.tam = tam;
        this.r = r;
    }

    public MyPoint getTam() {
        return tam;
    }

    public void setTam(MyPoint tam) {
        this.tam = tam;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getArea() {
        return this.r*this.r * Math.PI;
    }
    
    @Override
    public String toString() {
        return "hinh tron @(" + this.tam.getX() + ", " + this.tam.getY() + ") ban kinh = " + this.r; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
