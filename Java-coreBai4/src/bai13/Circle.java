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
public class Circle extends Elip {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*r; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
