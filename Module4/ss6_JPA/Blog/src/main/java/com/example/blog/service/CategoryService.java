package com.example.blog.service;

import com.example.blog.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    void create(Category category);
    void update(Category category);
    void delete(int id);
    Category findById(int id);
}
