package com.example.kiemtra.service;

import com.example.kiemtra.entity.DoanhNghiep;

import java.util.List;

public interface DoanhNghiepService {
    List<DoanhNghiep> findAll();

    void create(DoanhNghiep doanhNghiep);

    void update(DoanhNghiep doanhNghiep);

    void delete(String id);

    DoanhNghiep findById(String id);
}
