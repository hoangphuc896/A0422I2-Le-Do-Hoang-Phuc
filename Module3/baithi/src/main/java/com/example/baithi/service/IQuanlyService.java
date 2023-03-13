package com.example.baithi.service;

import com.example.baithi.model.Quanly;

import java.util.List;

public interface IQuanlyService {
    List<Quanly> findAll();

    Quanly findById(int id);

    void addNewUser(Quanly quanly);

    boolean updateUser(Quanly quanly);

    boolean deleterUser(int id);

    List<Quanly> SearchUser(String name1);

}
