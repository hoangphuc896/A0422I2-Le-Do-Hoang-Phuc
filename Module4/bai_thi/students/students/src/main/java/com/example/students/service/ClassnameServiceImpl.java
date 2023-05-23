package com.example.students.service;

import com.example.students.entity.ClassName;

import java.util.List;

public interface ClassnameServiceImpl {
    List<ClassName> findAll();

    void create(ClassName className);

    void update(ClassName className);

    void delete(String id);

    ClassName findById(String id);
}
