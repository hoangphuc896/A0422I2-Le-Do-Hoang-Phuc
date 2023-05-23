package com.example.kiemtra.service;

import com.example.kiemtra.entity.DuAn;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DuAnService {
    Page<DuAn> findAll(Pageable pageable);

    void addNew(DuAn duAn);

    void update(DuAn duAn);

    void delete(String id);

    DuAn findById(String id);

    List<DuAn> searchAll(String tenDuAn, String thoiGian);

    List<DuAn> findByClassId(String id);

}

