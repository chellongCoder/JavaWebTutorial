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
public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void addNew() {
        Scanner sc = new  Scanner(System.in);
        System.out.println("input id product> ");
        this.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("input name product> ");
        this.setName(sc.nextLine());
        System.out.println("input price product> ");
        this.setPrice(Double.parseDouble(sc.nextLine()));
        System.out.println("input quantity product> ");
        this.setQuantity(Integer.parseInt(sc.nextLine()));
    }
    
    @Override
    public String toString() {
        return this.id + " | " + this.name + " | " + this.price + " | " + this.quantity;
    }
    
    
}
