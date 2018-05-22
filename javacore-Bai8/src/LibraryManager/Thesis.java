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
public class Thesis extends Document {
    private String school;
    private String faculity;
    private String year;

    public Thesis() {
    }

    public Thesis(String school, String faculity, String year, int id, String title, String author, int count) {
        super(id, title, author, count);
        this.school = school;
        this.faculity = faculity;
        this.year = year;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFaculity() {
        return faculity;
    }

    public void setFaculity(String faculity) {
        this.faculity = faculity;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{Thesis}> "+ super.toString() + ", school=" + school + ", faculity=" + faculity + ", year=" + year; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void input() {
        System.out.println("==========input thesis===========");
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("input school> ");
        this.setSchool(sc.nextLine());
        System.out.println("input faculity> ");
        this.setFaculity(sc.nextLine());
        System.out.println("input year> ");
        this.setYear(sc.nextLine());
    }
    
    
}
