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
public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle circle = new MyCircle(new MyPoint(1, 2), 5);
        System.out.println("tam hinh tron> " + circle.getTam());
        System.out.println("dien tich hinh tron> " + circle.getArea());
    }
}
