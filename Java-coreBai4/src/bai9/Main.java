/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

/**
 *
 * @author chellong
 */
public class Main {

    public static void main(String[] args) {
        Vector v1 = new Vector(1, 1, 2, 2);
        v1.setX(v1.getHdCuoi()-v1.getHdDau());
        v1.setY(v1.getTdCuoi()-v1.getTdDau());
        Vector v2 = new Vector(0, 0, 0, 0);
        v2.setX(v2.getHdCuoi()-v2.getHdDau());
        v2.setY(v2.getTdCuoi()-v2.getTdDau());
        
        Vector vec = new Vector();
        System.out.println("do dai vector1> " + vec.moduleVector(v1));
        System.out.println("tong 2 vector> " + vec.vectorTong(v1, v2));
        
        if (vec.isEqualVector(v1, v2)) {
            System.out.println("2 vector bang nhau");
        } else {
            System.out.println("2 vector khac nhau");
        }
    }
}
