package com.example.thi.service;

import com.example.thi.model.ChoThue;
import com.example.thi.model.Homestay;

import java.util.List;

public interface ITcomplexservice {
    List<Homestay> findAllHomestay();
    List<ChoThue> findAllChothue();
    void addNew(Homestay homestay);
    void update(Homestay homestay);
    void deleteById(int maMB);
    Homestay findById(int id ,int idThanhtoan);
    List<Homestay> searchName(int name);
    ChoThue findchothue(int soTang);
}
