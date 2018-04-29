/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author chellong
 */
public class Main {
    public static void main(String[] args) {
        Polygon hbh = new Parallelogram(3, 2, 2);
        Polygon hcn = new Rectangle(4, 2);
        Polygon hv =new Square(4);
        
        System.out.println("chu vi hbh> " + hbh.tinhChuVi());
        System.out.println("dien tich hbh> " + hbh.tinhDienTich());
        
        System.out.println("chu vi hcn> " + hcn.tinhChuVi());
        System.out.println("dien tich hcn> " + hcn.tinhDienTich());
        
        System.out.println("chu vi hv> " + hv.tinhChuVi());
        System.out.println("dien tich hv> " + hv.tinhDienTich());
    }
}
