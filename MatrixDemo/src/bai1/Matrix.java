/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Matrix {
    private int row;
    private int col;
    private int[][] values;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
    
    
    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        values = new int[this.row][this.col];
    }
    
    public void tinhTongHang() {
        for (int i = 0; i < this.row; i++) {
            int sum=0;
            for (int j  = 0; j < this.col; j++) {
                sum+=values[i][j];
            }
            System.out.println("sum of row: " + sum);
        }
    }
    
    public void setMatrix () {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.println("matrix" + "[" + i + "]" + "[" + j + "]" + ": ");
                values[i][j] = sc.nextInt();
            }
        }
    }
    
    public int[][] getMatrix() {
        return this.values;
    }
    
    public void inMatran () {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(values[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
