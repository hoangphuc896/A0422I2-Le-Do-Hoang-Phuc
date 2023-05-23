package com.example.kiemtra.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Entity
@Table(name = "duan")
public class DuAn {
    @Id
    @Pattern(regexp = "DA-[0-9]{4}")
    @Column(columnDefinition = "varchar(20)")
    private String maDuAn;
    private String tenDuAn;
    private long kinhPhi;
    private String moTa;
    @Pattern(regexp = "[0-9]")
    private String thoiGian;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ngayDangKy;
    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "doanhnghiep_ma_doanh_nghiep", nullable = false)
    private DoanhNghiep doanhnghiep;

    public DuAn() {
    }

    public DuAn(String maDuAn, String tenDuAn, long kinhPhi, String moTa, String thoiGian, LocalDate ngayDangKy, DoanhNghiep doanhnghiep) {
        this.maDuAn = maDuAn;
        this.tenDuAn = tenDuAn;
        this.kinhPhi = kinhPhi;
        this.moTa = moTa;
        this.thoiGian = thoiGian;
        this.ngayDangKy = ngayDangKy;
        this.doanhnghiep = doanhnghiep;
    }

    public String getMaDuAn() {
        return maDuAn;
    }

    public void setMaDuAn(String maDuAn) {
        this.maDuAn = maDuAn;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public long getKinhPhi() {
        return kinhPhi;
    }

    public void setKinhPhi(long kinhPhi) {
        this.kinhPhi = kinhPhi;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }

    public LocalDate getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(LocalDate ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public DoanhNghiep getDoanhnghiep() {
        return doanhnghiep;
    }

    public void setDoanhnghiep(DoanhNghiep doanhnghiep) {
        this.doanhnghiep = doanhnghiep;
    }
}