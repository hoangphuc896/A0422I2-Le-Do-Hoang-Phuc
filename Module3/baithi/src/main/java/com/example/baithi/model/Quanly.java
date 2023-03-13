package com.example.baithi.model;

public class Quanly {
    private int id;
    private String name1;
    private String gia;
    private String soluong;
    private String mau;
    private String thietbi;

    public Quanly() {
    }

    public Quanly(int id, String name1, String gia, String soluong, String mau, String thietbi) {
        this.id = id;
        this.name1 = name1;
        this.gia = gia;
        this.soluong = soluong;
        this.mau = mau;
        this.thietbi = thietbi;
    }

    public Quanly(String name1, String gia, String soluong, String mau, String thietbi) {

        this.name1 = name1;
        this.gia = gia;
        this.soluong = soluong;
        this.mau = mau;
        this.thietbi = thietbi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getThietbi() {
        return thietbi;
    }

    public void setThietbi(String thietbi) {
        this.thietbi = thietbi;
    }
}
