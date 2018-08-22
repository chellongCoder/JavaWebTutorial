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
public class Nha extends BatDongSan {
    LoaiNha loaiNha;

    public Nha() {
    }

    public Nha(LoaiNha loaiNha) {
        this.loaiNha = loaiNha;
    }

    public LoaiNha getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(LoaiNha loaiNha) {
        this.loaiNha = loaiNha;
    }

    @Override
    public String toString() {
        return "Nha{" + "loaiNha=" + loaiNha + '}';
    }

   @Override
    public double tinhTien() {
        switch (loaiNha) {
            case chungCu:
                return (this.dienTich * this.donGia * 90/100);
            case bietThu:
                return this.dienTich * this.donGia;
            default:
                System.err.println("nhap sai loai nha!");
                return 0;
        }
    }
    
    
}
