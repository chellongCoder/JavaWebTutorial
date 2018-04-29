/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Matrix {

    private int row;
    private int col;
    private int[][] values;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.values = new int[row][col];
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public void setMatrix() {
//        int[][] values = new int[this.row][this.col];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print("matrix[" + i + "]" + "[" + j + "]" + " :");
                values[i][j] = sc.nextInt();
            }
        }
    }

    public int[][] getmatrix() {
        return this.values;
    }

    public void tinhTongHang() {
        for (int i = 0; i < this.row; i++) {
            int sum = 0;
            for (int j = 0; j < this.col; j++) {
                sum += values[i][j];
            }
            System.out.println("sum of row " + "[" + i + "]" + " : " + sum);
        }
    }

    public void tinhTongCot() {
        for (int i = 0; i < row; i++) {
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += values[j][i];
            }
            System.out.println("sum of col " + "[" + i + "]" + " : " + sum);
        }
    }
    
    public static Matrix tinhTong2MaTran(Matrix matrixA, Matrix matrixB) {
        if(matrixA.getRow()!=matrixB.getRow() && matrixA.getCol()!=matrixB.getCol()) return null;
        Matrix matrixSum = new Matrix(3, 3);
        for (int i = 0; i < matrixSum.getRow(); i++) {
            for (int j = 0; j < matrixSum.getCol(); j++) {
                matrixSum.values[i][j] = matrixA.values[i][j] + matrixB.values[i][j];
            }
        }
        return matrixSum;
    }
}
