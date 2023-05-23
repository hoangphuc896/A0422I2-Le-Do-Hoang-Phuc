package com.example.kiemtra.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "doanhnghiep")
public class DoanhNghiep {
    @Id
    @Pattern(regexp = "DN-[0-9]{2}")
    @Column(columnDefinition = "varchar(20)")
    private String maDoanhNghiep;
    private String tenDoanhNghiep;
    private String linhVuc;
    @Pattern(regexp = "[0-9]{8}")
    private String sDT;
    private String email;
    private String diaChi;
    @OneToMany(mappedBy = "doanhnghiep",cascade = CascadeType.ALL)
    private List<DuAn> duAns;

    public DoanhNghiep() {
    }

    public DoanhNghiep(String maDoanhNghiep, String tenDoanhNghiep, String linhVuc, String sDT, String email, String diaChi, List<DuAn> duAns) {
        this.maDoanhNghiep = maDoanhNghiep;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.linhVuc = linhVuc;
        this.sDT = sDT;
        this.email = email;
        this.diaChi = diaChi;
        this.duAns = duAns;
    }

    public String getMaDoanhNghiep() {
        return maDoanhNghiep;
    }

    public void setMaDoanhNghiep(String maDoanhNghiep) {
        this.maDoanhNghiep = maDoanhNghiep;
    }

    public String getTenDoanhNghiep() {
        return tenDoanhNghiep;
    }

    public void setTenDoanhNghiep(String tenDoanhNghiep) {
        this.tenDoanhNghiep = tenDoanhNghiep;
    }

    public String getLinhVuc() {
        return linhVuc;
    }

    public void setLinhVuc(String linhVuc) {
        this.linhVuc = linhVuc;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public List<DuAn> getDuAns() {
        return duAns;
    }

    public void setDuAns(List<DuAn> duAns) {
        this.duAns = duAns;
    }
}
