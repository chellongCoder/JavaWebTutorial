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
public class Document {
    protected int id;
    protected String title;
    protected String author;
    protected int count;

    public Document() {
    }

    public Document(int id, String title, String author, int count) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    protected void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input id>  ");
        this.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("input title> ");
        this.setTitle(sc.nextLine());
        System.out.println("input author> ");
        this.setAuthor(sc.nextLine());
        System.out.println("input count> ");
        this.setCount(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String toString() {
        return  "id=" + id + ", title=" + title + ", author=" + author + ", count=" + count  ;
    }
    
    
}
