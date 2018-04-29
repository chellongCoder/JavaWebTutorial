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
public class Parallelogram extends Polygon{
    private double canhKe1;
    private double canhKe2;
    private double duongCaoCanhKe1;

    public Parallelogram(double canhKe1, double canhKe2, double duongCaoCanhKe1) {
        this.canhKe1 = canhKe1;
        this.canhKe2 = canhKe2;
        this.duongCaoCanhKe1 = duongCaoCanhKe1;
    }

    public Parallelogram() {
    }
    
    @Override
    protected double tinhDienTich() {
        return canhKe1*duongCaoCanhKe1;
    }

    @Override
    protected double tinhChuVi() {
        return 2*(canhKe1 + canhKe2);
    }
    
    
}
