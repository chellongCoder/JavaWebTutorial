/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

/**
 *
 * @author chellong
 */
public class Shop {
    private List<Product> ProductList ;

    public Shop() {
        ProductList = new ArrayList<>();
    }
    
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        Product pro = new Product();
        
        System.out.println("nhap ten sp: ");
        String name=sc.nextLine();
        for(Product p : ProductList) {
            int index = ProductList.indexOf(p);
            if(p.getName().equalsIgnoreCase(name.trim())) {
                System.out.println("san pham nay da co trong shop");
                System.out.println("nhap danh gia: ");
                int rate = Integer.parseInt(sc.nextLine());
                int i=0;
                while(true) {
                    if(p.getRate()[i]==0){
//                        System.out.println("rate: " + pro.getRate()[i]);
                        p.getRate()[i] = rate;
                        break;
                    }
                    i++;
                    if(i>Product.MAX) break;
                }
                ProductList.set(index, p);
                return;
            }
        }
        pro.setName(name);
        do {
            System.out.println("nhap gia sp: ");
            pro.setPrice(Double.parseDouble(sc.nextLine()));
        }while(pro.getPrice()<0 || pro.getPrice()>100);
        System.out.println("nhap mo ta: ");
        pro.setDescription(sc.nextLine());
        System.out.println("nhap danh gia: ");
        int rate = Integer.parseInt(sc.nextLine());
        pro.getRate()[0] = rate;
        this.ProductList.add(pro);
    }
    
    void removeProduct() {
        System.out.println("nhap ten sp can xoa> ");
        String name = new Scanner(System.in).nextLine();
        for(Product pro : ProductList) {
            if(pro.getName().equals(name)) {
                ProductList.remove(pro);
                break;
            }
        
        }
        System.out.println("da xoa!");
    }
    
    public void interateProduct() {
        for(Product p : ProductList){
            p.viewInfo();
            System.out.print("danh gia san pham> ");
            int i=0;
            int sum=0;
            while(p.getRate()[i]!=0) {
                sum+=p.getRate()[i];
                i++;
            }
            System.out.println((float)sum/i);
            System.out.println();
        }
    }
    
    public void searchProduct() {
        double num1, num2;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap so 1: ");
        num1 = Double.parseDouble(sc.nextLine());
        System.out.println("nhap so 2: ");
        num2 = Double.parseDouble(sc.nextLine());
        
        double max = num1>num2 ? num1 : num2;
        double min = num1<num2 ? num1 : num2;
        
        for(Product p : ProductList) {
            if(p.getPrice()>=min && p.getPrice()<=max) {
                p.viewInfo();
            }
        }
    }
}
