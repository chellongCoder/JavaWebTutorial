/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

/**
 *
 * @author chellong
 */
public class Product {
    public static final int MAX = 100;
    
    private String name;
    private String Description;
    private double price;
    int[] rate;

    public Product() {
        rate = new int[MAX];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int[] getRate() {
        return rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }
    
    
    
    public void viewInfo() {
        System.out.println("ten sp> " + this.name );
        System.out.println("gia sp> " + this.price);
        System.out.println("mo ta sp> " + this.Description);
    }
    
}
