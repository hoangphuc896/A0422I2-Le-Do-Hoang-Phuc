package com.example.kiemtra.service;

import com.example.kiemtra.entity.DoanhNghiep;
import com.example.kiemtra.repository.DoanhNghiepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoanhNghiepServiceImpl implements DoanhNghiepService {

    @Autowired
    private DoanhNghiepRepository doanhNghiepRepository;


    @Override
    public List<DoanhNghiep> findAll() {
        return doanhNghiepRepository.findAll();
    }

    @Override
    public void create(DoanhNghiep doanhNghiep) {
    doanhNghiepRepository.save(doanhNghiep);
    }

    @Override
    public void update(DoanhNghiep doanhNghiep) {
        doanhNghiepRepository.save(doanhNghiep);
    }

    @Override
    public void delete(String id) {
        doanhNghiepRepository.deleteById(id);
    }

    @Override
    public DoanhNghiep findById(String id) {
        return doanhNghiepRepository.findById(id).orElse(null);
    }
}
