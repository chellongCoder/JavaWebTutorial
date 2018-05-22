/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManager;

import java.util.Scanner;

/**
 *
 * @author chellong
 */
public class Book extends Document {
    private String publisher;
    private String version;
    private String year;

    public Book() {
    }

    public Book(String publisher, String version, String year, int id, String title, String author, int count) {
        super(id, title, author, count);
        this.publisher = publisher;
        this.version = version;
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    protected void input() {
        System.out.println("===========input book=============");
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("input publisher> ");
        this.setPublisher(sc.nextLine());
        System.out.println("input version> ");
        this.setVersion(sc.nextLine());
        System.out.println("input year> ");
        this.setYear(sc.nextLine());
        
    }

    @Override
    public String toString() {
        return "{Book}> "+super.toString() +  ", publisher=" + publisher + ", version=" + version + ", year=" + year ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
