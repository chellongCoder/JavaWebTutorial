/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17.cau1;

/**
 *
 * @author chellong
 */
public class MyPoint {
    private int x,y;

    public MyPoint() {
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.x - y;
        
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    public double distance(MyPoint another) {
        int xDiff = this.x - another.getX();
        int yDiff = this.x - another.getY();
        
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    
    @Override
    public String toString() {
        return "("+this.x + " , " + this.y + ")";
    }
}
