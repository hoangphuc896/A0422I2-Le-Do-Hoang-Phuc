package com.example.thi.repository;

import com.example.thi.model.ChoThue;
import com.example.thi.model.Homestay;

import java.util.List;

public interface ITComplexRepository {
    List<Homestay> findAllHomestay();
    List<ChoThue> findAllChothue();
    void addNew(Homestay homestay);
    void update(Homestay homestay);
    void deleteById(int maMB);
    Homestay findById(int maMB, int soTang);
    List<Homestay> searchName(int name);
    ChoThue findchothue(int SoTang);
}
