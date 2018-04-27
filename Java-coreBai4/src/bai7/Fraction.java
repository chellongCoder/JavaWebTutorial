/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author imac
 */
public class Fraction {
    private int tuSo;
    private int mauSo;
    Scanner sc = new Scanner(System.in);
    public Fraction() {
    }

    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
    public void inputFraction() {
        do {            
            System.out.println("nhap tu so> ");
            setTuSo(sc.nextInt());
            System.out.println("nhapmau so> ");
            setMauSo(sc.nextInt());
        } while (this.tuSo==0 || this.mauSo==0);
    }
    
    public void showFraction() {
//        System.out.println("phan so vua nhap> ");
        if(this.mauSo==1) {
            System.out.println(this.tuSo);
        } else {
            System.out.println(this.tuSo + " / " + this.mauSo);
        }
    }
    
    public int USCLN(int a, int b) {
        int du;
        while(b!=0) {
            du = a%b;
            a=b;
            b=du;
        }
        return a;
    }
    
    public Fraction rutGonPhanSo () {
        Fraction ps = new Fraction();
        int tuSo = this.getTuSo()/USCLN(this.getTuSo(), this.getMauSo());
        int mauSo = this.getMauSo()/USCLN(this.getTuSo(), this.getMauSo());
        ps.setTuSo(tuSo);
        ps.setMauSo(mauSo);
//        System.out.println("phan so sau khi rut gon:> ");
        return ps;
    }
    
    public Fraction nghichDaoPhanSo() {
        Fraction ps = new Fraction();   
        ps.setTuSo(this.getMauSo());
        ps.setMauSo(this.getTuSo());
        return ps;
    }
    
    public Fraction tong2PhanSo(Fraction ps1, Fraction ps2) {

        int msc = (ps1.getMauSo()*ps2.getMauSo()) / USCLN(ps1.getMauSo(), ps2.getMauSo());
        Fraction psTong = new Fraction();
        int tuSo = (msc/ps1.getMauSo())*ps1.getTuSo() + (msc/ps2.getMauSo())*ps2.getTuSo();
        psTong.setTuSo(tuSo);
        psTong.setMauSo(msc);
        psTong = psTong.rutGonPhanSo();
        return psTong;
        
    }
    
    public Fraction hieu2PhanSo(Fraction ps1, Fraction ps2) {

        int msc = (ps1.getMauSo()*ps2.getMauSo()) / USCLN(ps1.getMauSo(), ps2.getMauSo());
        Fraction psHieu = new Fraction();
        int tuSo = (msc/ps1.getMauSo())*ps1.getTuSo() - (msc/ps2.getMauSo())*ps2.getTuSo();
        psHieu.setTuSo(tuSo);
        psHieu.setMauSo(msc);
        psHieu = psHieu.rutGonPhanSo();
        return psHieu;
        
    }
    
    public Fraction nhan2PhanSo(Fraction ps1, Fraction ps2) {
        Fraction psNhan = new Fraction();
        psNhan.setTuSo(ps1.getTuSo() * ps2.getTuSo());
        psNhan.setMauSo(ps1.getMauSo() * ps2.getMauSo());
        psNhan.rutGonPhanSo();
        return psNhan;
    }
    
    public Fraction chia2PhanSo(Fraction ps1, Fraction ps2) {
        Fraction psChia = new Fraction();
        ps2=ps2.nghichDaoPhanSo();
        psChia.setTuSo(ps1.getTuSo() * ps2.getTuSo());
        psChia.setMauSo(ps1.getMauSo() * ps2.getMauSo());
        psChia.rutGonPhanSo();
        return psChia;
    }
    
    @Override
    public String toString() {
        return this.tuSo + " / " + this.mauSo;
    }
}
