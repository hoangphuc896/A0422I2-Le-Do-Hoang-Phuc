package com.example.kiemtra.service;

import com.example.kiemtra.entity.DuAn;
import com.example.kiemtra.repository.DuAnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DuAnServiceImpl implements DuAnService {

    @Autowired
    private DuAnRepository duAnRepository;

    @Override
    public Page<DuAn> findAll(Pageable pageable) {
        return duAnRepository.findAll(pageable);
    }

    @Override
    public void addNew(DuAn duAn) {
        duAnRepository.save(duAn);
    }

    @Override
    public void update(DuAn duAn) {
        duAnRepository.save(duAn);
    }

    @Override
    public void delete(String id) {
    duAnRepository.deleteById(id);
    }

    @Override
    public DuAn findById(String id) {
        return duAnRepository.findById(id).orElse(null);
    }

    @Override
    public List<DuAn> searchAll(String tenDuAn, String thoiGian) {
        return duAnRepository.findAllByTenDuAnContainingOrThoiGianContaining(tenDuAn,thoiGian);
    }

    @Override
    public List<DuAn> findByClassId(String id) {
        return duAnRepository.findDuAnByDoanhnghiep_MaDoanhNghiep(id);
    }
}
