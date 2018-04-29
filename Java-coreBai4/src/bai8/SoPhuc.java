/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

/**
 *
 * @author chellong
 */
public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
    
    public SoPhuc tongSoPhuc (SoPhuc sp1, SoPhuc sp2) {
        SoPhuc spTong = new SoPhuc();
        spTong.setPhanThuc(sp1.getPhanThuc()+sp2.getPhanThuc());
        spTong.setPhanAo(sp1.getPhanAo()+sp2.getPhanAo());
        return spTong;
    }
    
    public SoPhuc hieuSoPhuc (SoPhuc sp1, SoPhuc sp2) {
        SoPhuc spHieu = new SoPhuc();
        spHieu.setPhanThuc(sp1.getPhanThuc()-sp2.getPhanThuc());
        spHieu.setPhanAo(sp1.getPhanAo()-sp2.getPhanAo());
        return spHieu;
    }
    
    public SoPhuc tichSoPhuc(SoPhuc sp1, SoPhuc sp2) {
        SoPhuc spTich = new SoPhuc();
        double phanThuc = sp1.getPhanThuc()*sp2.getPhanThuc() - sp1.getPhanAo()*sp2.getPhanAo();
        spTich.setPhanThuc(phanThuc);
        double phanAo = sp1.getPhanThuc()*sp2.getPhanAo() + sp2.getPhanThuc()*sp1.getPhanAo();
        spTich.setPhanAo(phanAo);
        return spTich;
    }
    
    public SoPhuc thuongSoPhuc(SoPhuc sp1, SoPhuc sp2) {
        SoPhuc spThuong = new SoPhuc();
        double phanThuc = (sp1.getPhanThuc()*sp2.getPhanThuc() + sp1.getPhanAo()*sp1.getPhanAo()) / (sp2.getPhanThuc()*sp2.getPhanThuc() + sp2.getPhanAo()*sp2.getPhanAo());
        spThuong.setPhanThuc(phanThuc);
        double phanAo = (sp2.getPhanThuc()*sp1.getPhanAo() - sp1.getPhanThuc()*sp2.getPhanAo()) / (sp2.getPhanThuc()*sp2.getPhanThuc() + sp2.getPhanAo()*sp2.getPhanAo());
        spThuong.setPhanAo(phanAo);
        return spThuong;
    }
    
    @Override
    public String toString() {
        return this.phanAo<0 ? this.phanThuc +"" +this.phanAo+"i" : this.phanThuc+"+" + this.phanAo+"i";
    }
}
