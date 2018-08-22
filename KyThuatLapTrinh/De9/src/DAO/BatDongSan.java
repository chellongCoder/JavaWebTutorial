/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Date;

/**
 *
 * @author chellong
 */
public abstract class BatDongSan {
    protected String diaChi;
    protected double donGia;
    protected double dienTich;
    protected Date ngayGiaoDich;

    public BatDongSan() {
    }

    public BatDongSan(String diaChi, double donGia, double dienTich, Date ngayGiaoDich) {
        this.diaChi = diaChi;
        this.donGia = donGia;
        this.dienTich = dienTich;
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public abstract double tinhTien();
    
    
    
    
}
