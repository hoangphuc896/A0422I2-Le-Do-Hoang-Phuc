package com.example.kiemtra.repository;

import com.example.kiemtra.entity.DuAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Pattern;
import java.util.List;


@Repository
public interface DuAnRepository extends JpaRepository<DuAn,String> {
    List<DuAn>findAllByTenDuAnContainingOrThoiGianContaining(String tenDuAn, @Pattern(regexp = "[0-9]") String thoiGian);
    List<DuAn>findDuAnByDoanhnghiep_MaDoanhNghiep(@Pattern(regexp = "DN-[0-9]{2}") String doanhnghiep_maDoanhNghiep);
}
