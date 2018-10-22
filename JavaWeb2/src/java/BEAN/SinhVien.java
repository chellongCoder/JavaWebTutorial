/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

/**
 *
 * @author chellong
 */
public class SinhVien {
    private int id;
    private String name;
    private String khoa;
    private String lop;

    public SinhVien(int id, String name, String khoa, String lop) {
        this.id = id;
        this.name = name;
        this.khoa = khoa;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public SinhVien() {
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", name=" + name + ", khoa=" + khoa + ", lop=" + lop + '}';
    }
    
    
}
