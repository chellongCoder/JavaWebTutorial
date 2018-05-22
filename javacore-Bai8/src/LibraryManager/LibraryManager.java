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
public class LibraryManager {
    private Document[]docs;
    private static final int MAX=100;
    private int index;
    public static Paper Papers[];
    public static Book Books[];
    public static Thesis Thesises[];
    public LibraryManager() {
        docs = new Document[MAX];
        index = 0;
        Papers = new Paper[MAX];
        Books = new Book[MAX];
        Thesises = new Thesis[MAX];
    }
    
    /*
        @param : category
        1. paper
        2. book
        3. thesis
    */
    public void input(int category) {
        Document doc = null;
        switch(category) {
            case 1: {
                doc = new Paper();
                doc.input();
            } break;
            case 2: {
                doc = new Book();
                doc.input();
            }break;
            case 3: {
                doc = new Thesis();
                doc.input();
            }break;
            default: System.out.println("khong co loai docs " + category); return;
        }
        docs[index++] = doc;
    }
    
    public void output() {
        int indexPaper = 0, indexBook=0, indexThesis=0;
        System.out.println("=========Paper==========");
        for(Document doc: docs) {
            if(doc instanceof Paper) {
                System.out.println(doc);
                Papers[indexPaper++] = (Paper)doc;
            }
        }
        System.out.println("=========Book==========");
        for(Document doc: docs) {
            if(doc instanceof Book) {
                System.out.println(doc);
                Books[indexBook++] = (Book)doc;
            }
        }
        System.out.println("=========Thesis==========");
        for(Document doc: docs) {
            if(doc instanceof Thesis) {
                System.out.println(doc);
                Thesises[indexThesis++] = (Thesis)doc;
            }
        }
    }
    
    public void Search (Document[] docs) {
        boolean check = false;
        String name = new Scanner(System.in).nextLine();
        for(Document d : docs) {
            if(d.getTitle().equalsIgnoreCase(name)) {
                System.out.println(d);
                check = true;
            }
        }
        if(!check) {
            System.out.println("khong co doc ten " + name);
        }
    }
}