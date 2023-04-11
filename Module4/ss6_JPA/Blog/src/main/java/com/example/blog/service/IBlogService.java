package com.example.blog.service;

import com.example.blog.entity.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);

    void create(Blog blog);

    void update(Blog blog);

    void delete(int id);

    Blog findById(int id);

    List<Blog> findByTitle(String title);

    List<Blog> findByCategoryId(int id);

}
