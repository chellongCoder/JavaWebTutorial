/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

/**
 *
 * @author chellong
 */
public class Vector {
    private int hdDau;
    private int tdDau;
    private int hdCuoi;
    private int tdCuoi;
    
    private int X;
    private int Y;
    
    public Vector() {
    }

    public Vector(int hdDau, int tdDau, int hdCuoi, int tdCuoi) {
        this.hdDau = hdDau;
        this.tdDau = tdDau;
        this.hdCuoi = hdCuoi;
        this.tdCuoi = tdCuoi;
    }
    
    
    public int getHdDau() {
        return hdDau;
    }

    public void setHdDau(int hdDau) {
        this.hdDau = hdDau;
    }

    public int getTdDau() {
        return tdDau;
    }

    public void setTdDau(int tdDau) {
        this.tdDau = tdDau;
    }

    public int getHdCuoi() {
        return hdCuoi;
    }

    public void setHdCuoi(int hdCuoi) {
        this.hdCuoi = hdCuoi;
    }

    public int getTdCuoi() {
        return tdCuoi;
    }

    public void setTdCuoi(int tdCuoi) {
        this.tdCuoi = tdCuoi;
    }
    
    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public void setX(int X) {
        this.X = X;
    }
    public void setY(int Y) {
        this.Y = Y;
    }
  
    public Vector vectorTong (Vector v1, Vector v2) {
        
        Vector vec = new Vector();
        vec.setX(v1.getX()+v2.getX());
        vec.setY(v1.getY()+v2.getY());
        return vec;
    }
    
    public Vector vectorHieu (Vector v1, Vector v2) {
        
        Vector vec = new Vector();
        vec.setX(v1.getX()-v2.getX());
        vec.setY(v1.getY()-v2.getY());
        return vec;
    }
    
    public double moduleVector(Vector vec) {
        return Math.sqrt(vec.getX()*vec.getX() + vec.getY()*vec.getY());
    }
    
    public double goc2Vector(Vector v1, Vector v2) {
//        Math.acos(X)
        return 0;
    }
    
    public int tichVoHuong(Vector v1, Vector v2) {
        Vector vec = new Vector();
        return v1.getX()*v2.getX() + v1.getY()*v2.getY();
    }
    
    public boolean vecCungPhuong(Vector v1, Vector v2) {
        return v1.getX()*v2.getY() - v1.getY()*v2.getX() == 0 ? true : false;
    }
    
    public boolean isEqualVector(Vector v1, Vector v2) {
        Vector vecTong = vectorHieu(v1, v2);
        return vecTong.getX()==0 && vecTong.getY()==0 ? true : false;
    }
    
    @Override
    public String toString() {
        return "("+ this.X + " , " + this.Y+")";
    }
}
