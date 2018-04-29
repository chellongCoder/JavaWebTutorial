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
public class Rectangle extends Parallelogram{
    private double chieuDai;
    private double chieuRong;

    public Rectangle(double chieuDai,double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public Rectangle () {
        
    }
    @Override
    public double tinhChuVi() {
        return 2*(chieuDai + chieuRong);
    }
    
    @Override
    public double tinhDienTich() {
        return this.chieuDai * this.chieuRong;
    }
}
