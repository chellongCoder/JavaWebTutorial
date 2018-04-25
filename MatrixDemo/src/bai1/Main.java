/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author chellong
 */
public class Main {
    public static void main(String[] args) {
//        Matrix matrix = new Matrix();

        Matrix matrixA = new Matrix(3,3);
        System.out.println("nhap ma tran> ");
        matrixA.setMatrix();
        int[][] matrix = matrixA.getMatrix();
        System.out.println("in ma tran> ");
        matrixA.inMatran();
        matrixA.tinhTongHang();
//        Matrix matrixB = new  Matrix(3,3);
//        System.out.println("nhap ma tran> ");
//        matrixB.setMatrix();
//        int[][] matrix1 = matrixB.getMatrix();
//        System.out.println("in ma tran> ");
//        matrixB.inMatran();
    }
}
