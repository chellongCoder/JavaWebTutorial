/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEAN;

import java.util.Date;

/**
 *
 * @author chellong
 */
public class News {

    private int id;
    private String title;
    private String image;
    private String summary;
    private String content;
    private Date create_at;
    private Authors author;

    public News() {
    }

    public News(int id, String title, String image, String summary, String content, Date create_at, Authors author) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.summary = summary;
        this.content = content;
        this.create_at = create_at;
        this.author = author;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getsummary() {
        return summary;
    }

    public void setsummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return this.title;
    }

}
