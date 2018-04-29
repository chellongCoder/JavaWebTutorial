/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

/**
 *
 * @author chellong
 */
public class Main {
    public static void main(String[] args) {
        Matrix matrixA = new Matrix(3, 3);
        matrixA.setMatrix();
        for (int i = 0; i < matrixA.getRow(); i++) {
            for (int j = 0; j < matrixA.getCol(); j++) {
                System.out.print(matrixA.getmatrix()[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("tinh tong hang: ");
        matrixA.tinhTongHang();
        matrixA.tinhTongCot();
        Matrix matrixB = new Matrix(3,3);
        System.out.println("Matrix B>");
        matrixB.setMatrix();
        for (int i = 0; i < matrixA.getRow(); i++) {
            for (int j = 0; j < matrixA.getCol(); j++) {
                System.out.print(matrixA.getmatrix()[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("tong 2 ma tran <A, B> ");
        
        Matrix matrixSum = Matrix.tinhTong2MaTran(matrixA, matrixB);
        for (int i = 0; i < matrixSum.getRow(); i++) {
            for (int j = 0; j < matrixSum.getCol(); j++) {
                 System.out.print(matrixSum.getmatrix()[i][j]+" ");
            }
            System.out.println();
        }
    }
}
