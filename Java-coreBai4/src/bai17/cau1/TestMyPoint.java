/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17.cau1;

/**
 *
 * @author chellong
 */
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,0);
        MyPoint p2 = new MyPoint(0,4);
        
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 6));
    }
}
