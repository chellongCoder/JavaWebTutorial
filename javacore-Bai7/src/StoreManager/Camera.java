/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StoreManager;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Camera extends Product {
    private boolean wifi;

    public Camera() {
    }

    public Camera(boolean wifi, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.wifi = wifi;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public void addNew() {
        super.addNew(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("has connect to wifi(yes or no)? ");
        String check;
        do {
            check = sc.nextLine();
            if(check.equalsIgnoreCase("yes")) {this.setWifi(true); break;};
            if(check.equalsIgnoreCase("no")) {this.setWifi(false);break;}
        }while(!check.equalsIgnoreCase("yes") || !check.equalsIgnoreCase("no"));
    }
    
     @Override
    public String toString() {
        if(this.wifi) {
            return super.toString() + " | " + "yes";
        } else {
            return super.toString() + " | " + "no";
        }
    }
}
