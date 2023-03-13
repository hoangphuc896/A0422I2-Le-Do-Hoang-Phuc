package com.example.quan_ly.model;

public class Iphone {
    private int id ;
    private String nameIphone;

    public Iphone() {
    }

    public Iphone(int id, String nameIphone) {
        this.id = id;
        this.nameIphone = nameIphone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameIphone() {
        return nameIphone;
    }

    public void setNameIphone(String nameIphone) {
        this.nameIphone = nameIphone;
    }
}
