package com.example.thi.service;

import com.example.thi.model.ChoThue;
import com.example.thi.model.Homestay;
import com.example.thi.repository.TComplexRepository;

import java.util.List;

public class Tcomplexservice implements ITcomplexservice{
    TComplexRepository tcomplexservice = new TComplexRepository();
    @Override
    public List<Homestay> findAllHomestay() {
        return tcomplexservice.findAllHomestay();
    }

    @Override
    public List<ChoThue> findAllChothue() {
        return tcomplexservice.findAllChothue();
    }

    @Override
    public void addNew(Homestay homestay) {
    tcomplexservice.addNew(homestay);
    }

    @Override
    public void update(Homestay homestay) {
    tcomplexservice.update(homestay);
    }

    @Override
    public void deleteById(int maMB) {
        tcomplexservice.deleteById(maMB);
    }

    @Override
    public Homestay findById(int maMB, int soTang) {
        return tcomplexservice.findById(maMB,soTang);
    }

    @Override
    public List<Homestay> searchName(int name) {
        return tcomplexservice.searchName(name);
    }

    @Override
    public ChoThue findchothue(int soTang) {
        return tcomplexservice.findchothue(soTang);
    }
}
