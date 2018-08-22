/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author chellong
 */
public class Dat extends BatDongSan {
    LoaiDat loaiDat;

    public Dat(LoaiDat loaiDat) {
        this.loaiDat = loaiDat;
    }

    public Dat() {
    }

    public LoaiDat getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(LoaiDat loaiDat) {
        this.loaiDat = loaiDat;
    }

    @Override
    public String toString() {
        return "Nha{" + "loaiDat=" + loaiDat + '}';
    }

    @Override
    public double tinhTien() {
        switch (loaiDat) {
            case A:
                return (this.dienTich * this.donGia * 1.5);
            case B: case C: 
                return this.dienTich * this.donGia;
            
            default:
                System.err.println("nhap sai loai dat!");
                return 0;
        }
    }
}
