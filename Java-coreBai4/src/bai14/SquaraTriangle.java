/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author chellong
 */
public class SquaraTriangle extends Triangle {
    private String goc90;

    public SquaraTriangle() {
    }

    public SquaraTriangle(String goc90, double canhA, double canhB, double canhC) {
        super(canhA, canhB, canhC);
        this.goc90 = goc90;
    }

    public String getGoc90() {
        return goc90;
    }

    public void setGoc90(String goc90) {
        this.goc90 = goc90;
    }

    
    
    
}
