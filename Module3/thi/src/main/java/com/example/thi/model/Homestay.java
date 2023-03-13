package com.example.thi.model;

public class Homestay {
    private int maMB ;
    private String dTich ;
    private int SoTang ;
    private String Mota;
    private String gia;
    private String NgayBD;
    private String NgayKT;

    public Homestay() {
    }

    public Homestay(int maMB, String dTich, int SoTang, String mota, String gia, String ngayBD, String ngayKT) {
        this.maMB = maMB;
        this.dTich = dTich;
        SoTang = SoTang;
        Mota = mota;
        this.gia = gia;
        NgayBD = ngayBD;
        NgayKT = ngayKT;
    }

    public Homestay(String dTich, int SoTang, String mota, String gia, String ngayBD, String ngayKT) {
    }

    public int getMaMB() {
        return maMB;
    }

    public void setMaMB(int maMB) {
        this.maMB = maMB;
    }

    public String getdTich() {
        return dTich;
    }

    public void setdTich(String dTich) {
        this.dTich = dTich;
    }

    public int getSoTang() {
        return SoTang;
    }

    public void setSoTang(int soTang) {
        SoTang = SoTang;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String mota) {
        Mota = mota;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getNgayBD() {
        return NgayBD;
    }

    public void setNgayBD(String ngayBD) {
        NgayBD = ngayBD;
    }

    public String getNgayKT() {
        return NgayKT;
    }

    public void setNgayKT(String ngayKT) {
        NgayKT = ngayKT;
    }
}
