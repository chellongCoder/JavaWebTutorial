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
public class Paper extends Document {
    private String journal;
    private String  year;

    public Paper() {
    }

    public Paper(String journal, String year, int id, String title, String author, int count) {
        super(id, title, author, count);
        this.journal = journal;
        this.year = year;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        
        return "{Paper}"+ super.toString() + ", journal=" + journal + ", year=" + year; //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    protected void input() {
        System.out.println("==========input paper===========");
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("input journal> ");
        this.setJournal(sc.nextLine());
        System.out.println("input year> ");
        this.setYear(sc.nextLine());
    }
    
    
}
