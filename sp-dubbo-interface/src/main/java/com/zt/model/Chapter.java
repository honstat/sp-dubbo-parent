package com.zt.model;

import java.io.Serializable;

public class Chapter implements Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getBook_id() {
        return book_id;
    }

    public void setBook_id(long book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSimHash() {
        return simHash;
    }

    public void setSimHash(String simHash) {
        this.simHash = simHash;
    }

    private long book_id;
    private String title;
    private int no;
    private String content;
    private String url;
    private String simHash;
}
