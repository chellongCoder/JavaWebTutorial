/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class DaThuc {
    private int bac;
    private double heSo[];

    public DaThuc() {
        
    }

    public DaThuc(int bac, double[] heSo) {
        this.bac = bac;
        this.heSo = heSo;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    public double[] getHeSo() {
        return heSo;
    }

    public void setHeSo(double[] heSo) {
        this.heSo = heSo;
    }
    
    public void nhapDaThuc() {
        int n;
        System.out.println("nhap vao bac cua da thuc> ");
        n = new Scanner(System.in).nextInt();
        this.setBac(n);
        double heSo[] = new double[n+1];
        System.out.println("nhap cac he so> ");
        for(int i=0; i<heSo.length; i++) {
            System.out.println("nhap he so co bac " + i +"> ");
            heSo[i] = new Scanner(System.in).nextDouble();
        }
        this.setHeSo(heSo);
    }
    
    public DaThuc tong2DaThuc(DaThuc d1, DaThuc d2){
        DaThuc dathuc = new DaThuc();
        
//        int max = d1.getBac()>d2.getBac() ? d1.getBac() : d2.getBac();
        DaThuc max  = d1.getBac()>d2.getBac() ? d1 : d2;
        DaThuc min = d1.getBac()<d2.getBac() ? d1 : d2;
//        int min = d1.getBac()<d2.getBac() ? d1.getBac() : d2.getBac();
        double heSo[] = new double[max.getBac()+1];
        dathuc.setBac(max.getBac());
        for (int i = 0; i < heSo.length; i++) {
            
            if(i>min.getBac()) {
                heSo[i] = max.getHeSo()[i];
            } else {
                heSo[i] = max.getHeSo()[i] + min.getHeSo()[i];
            }
            
        }
        dathuc.setHeSo(heSo);
        return dathuc;
    }
    
    @Override
    public String toString () {
        StringBuilder builder = new StringBuilder();
        for (int i = this.bac; i >= 0; i--) {
            if(i==0) {
                builder.append(this.heSo[0]);
            } else {
                builder.append(this.heSo[i]+"X^"+i+" + ");
            }
        }
        return builder.toString();
    }
}
