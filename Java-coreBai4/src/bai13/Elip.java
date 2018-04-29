/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

/**
 *
 * @author chellong
 */
public class Elip extends Point {
    private int a,b;

    public Elip() {
    }

    public Elip(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public double tinhDienTich() {
        return Math.PI*a*b;
    }
}
