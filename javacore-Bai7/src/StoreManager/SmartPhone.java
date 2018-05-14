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
public class SmartPhone extends Product {
    private boolean hasCamera;
    private int sim;

    public SmartPhone() {
    }

    public SmartPhone(boolean hasCamera, int sim, int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    @Override
    public void addNew() {
        Scanner sc = new Scanner(System.in);
        super.addNew(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("has camera (yes or no)? ");
        String check;
        do {
            check = sc.nextLine();
            if(check.equalsIgnoreCase("yes")) {this.setHasCamera(true); break;}
            if(check.equalsIgnoreCase("no")) {this.setHasCamera(false);break;}
        }while(true);
        System.out.println("input id sim> ");
        this.setSim(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String toString() {
        if(this.hasCamera) {
            return super.toString() + " | " + "yes" + " | " + this.sim;
        } else {
            return super.toString() + " | " + "no" + " | " + this.sim;
        }
    }

    
    
}
