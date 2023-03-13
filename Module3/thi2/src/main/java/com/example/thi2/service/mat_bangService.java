package com.example.thi2.service;

import com.example.thi2.model.mat_bang;

import java.sql.SQLException;
import java.util.List;

public interface mat_bangService {
    void insertMat_bang(mat_bang hop_dong) throws SQLException;

    mat_bang selectMat_bang(int id);

    List<mat_bang> selectAllMat_bang();

    boolean deleteMat_bang(int id) throws SQLException;

    boolean updateMat_bang(mat_bang mat_bang) throws SQLException;
}
