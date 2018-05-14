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
public class Square extends Rectangle{
    private double canh;
    
    public Square(double canh) {
        this.canh = canh;
    }

    public Square() {
    }
    

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }

    @Override
    public double tinhChuVi() {
        return 4*canh;
    }
    
    
}
