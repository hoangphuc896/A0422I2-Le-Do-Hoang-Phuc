package com.example.kiemtra.repository;

import com.example.kiemtra.entity.DoanhNghiep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoanhNghiepRepository extends JpaRepository<DoanhNghiep,String> {
}
