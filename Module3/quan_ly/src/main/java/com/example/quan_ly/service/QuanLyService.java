package com.example.quan_ly.service;

import com.example.quan_ly.model.Danhsach;
import com.example.quan_ly.model.Iphone;
import com.example.quan_ly.repository.QuanLyRepository;

import java.util.List;

public class QuanLyService implements IQuanLyService{
    QuanLyRepository quanLyRepository = new QuanLyRepository();
    @Override
    public List<Danhsach> findAllDanhsach() {
        return quanLyRepository.findAllDanhsach();
    }

    @Override
    public List<Iphone> findAllIphone() {
        return quanLyRepository.findAllIphone();
    }

    @Override
    public void addNew(Danhsach danhsach) {
    quanLyRepository.addNew(danhsach);
    }

    @Override
    public void update(Danhsach danhsach) {
    quanLyRepository.update(danhsach);
    }

    @Override
    public void deleteById(int id) {
    quanLyRepository.deleteById(id);
    }

    @Override
    public Danhsach findById(int id, int idThanhtoan) {
        return quanLyRepository.findById(id,idThanhtoan);
    }

    @Override
    public List<Danhsach> searchName(String name) {
        return quanLyRepository.searchName(name);
    }

    @Override
    public Iphone findIphone(int id) {
        return quanLyRepository.findIphone(id);
    }
}
