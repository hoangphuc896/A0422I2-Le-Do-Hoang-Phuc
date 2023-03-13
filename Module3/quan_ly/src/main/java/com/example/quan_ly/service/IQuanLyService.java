package com.example.quan_ly.service;

import com.example.quan_ly.model.Danhsach;
import com.example.quan_ly.model.Iphone;

import java.util.List;

public interface IQuanLyService {
    List<Danhsach> findAllDanhsach();
    List<Iphone> findAllIphone();
    void addNew(Danhsach danhsach);
    void update(Danhsach danhsach);
    void deleteById(int id);
    Danhsach findById(int id ,int idThanhtoan);
    List<Danhsach> searchName(String name);
    Iphone findIphone(int id);

}
