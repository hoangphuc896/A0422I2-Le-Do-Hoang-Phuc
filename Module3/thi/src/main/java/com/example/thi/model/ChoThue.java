package com.example.thi.model;

public class ChoThue {
    private int soTang;
    private String TrangThai;
    private String Loai;

    public ChoThue() {
    }

    public ChoThue(int soTang, String trangThai, String loai) {
        this.soTang = soTang;
        TrangThai = trangThai;
        Loai = loai;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String loai) {
        Loai = loai;
    }
}
