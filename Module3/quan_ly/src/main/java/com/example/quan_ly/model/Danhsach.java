package com.example.quan_ly.model;

public class Danhsach {
    private int id ;
    private String nameIphones;
    private String phone_number;
    private String note;
    private int id_thanh_toan;

    public Danhsach() {
    }

    public Danhsach(int id, String nameIphones, String phone_number, String note, int id_thanh_toan) {
        this.id = id;
        this.nameIphones = nameIphones;
        this.phone_number = phone_number;
        this.note = note;
        this.id_thanh_toan = id_thanh_toan;
    }

    public Danhsach(String nameIphones, String phone_number, String note, int id_thanh_toan) {
        this.nameIphones = nameIphones;
        this.phone_number = phone_number;
        this.note = note;
        this.id_thanh_toan = id_thanh_toan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameIphones() {
        return nameIphones;
    }

    public void setNameIphones(String nameIphones) {
        this.nameIphones = nameIphones;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getId_thanh_toan() {
        return id_thanh_toan;
    }

    public void setId_thanh_toan(int id_thanh_toan) {
        this.id_thanh_toan = id_thanh_toan;
    }
}
