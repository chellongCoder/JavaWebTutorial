/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaHinh;

/**
 *
 * @author chellong
 */
public class Triagle extends Shape {
    private double canhA, canhB, canhC;

    public Triagle(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }
    
    @Override
    public double caculateArea() {
        double p = (canhA+canhB+canhC)/2;
        System.out.println("p = " + p);
        return Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
    }
    
}
