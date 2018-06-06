/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionDemo;

/**
 *
 * @author chellong
 */
public class Util {
    public static boolean checkMaSV(String Ma){
        if(Ma.matches("HV\\d{3}")) {
            return true;
        }
        return false;
    }
    public static boolean checkDiemTongKet(double diem) {
        if(diem>0 && diem<10) {
            return true;
        }
        System.out.println("0<diem<10. Nhap lai!");
        return false;
    }
}
