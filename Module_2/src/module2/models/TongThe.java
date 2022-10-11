package module2.models;

import java.io.Serializable;
import java.util.Date;

public abstract class TongThe implements Serializable {
    private static final long serialVersionUID = 6433858223774886977L;
    private int idSanPham ;
    private int maSanpham ;
    private String tenSanPham ;
    private double giaBan ;
    private int soLuong ;
    private String nhaSanXuat ;

    public TongThe(){

    }

    public TongThe(int idSanPham, int maSanpham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat) {
        this.idSanPham = idSanPham;
        this.maSanpham = maSanpham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getMaSanpham() {
        return maSanpham;
    }

    public void setMaSanpham(int maSanpham) {
        this.maSanpham = maSanpham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return
                "idSanPham=" + idSanPham +
                ", maSanpham=" + maSanpham +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\''
                ;
    }
}
