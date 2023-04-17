package com.example.blog.controller;


import com.example.blog.entity.Blog;
import com.example.blog.entity.Category;
import com.example.blog.service.BlogServiceImpl;
import com.example.blog.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogRestController {
    @Autowired
    private BlogServiceImpl blogService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping("/{id}")
    public ResponseEntity<Blog> getBlogById(@PathVariable int id) {
        Blog blog = blogService.findById(id);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Blog>> findAllBlog() {
        List<Blog> blogs = blogService.findAll();
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blogs, HttpStatus.OK);
        }
    }

//    @GetMapping
//    public ResponseEntity<List<Category>> findAllCategory() {
//        List<Category> categories = categoryService.findAll();
//        if (categories.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(categories, HttpStatus.OK);
//        }
//    }

    @GetMapping("/{categoryId}")
    public ResponseEntity<List<Blog>> findBlogByCategoryId(@PathVariable int categoryId) {
        List<Blog> blogs = blogService.findByCategoryId(categoryId);
        if (blogs.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }
}

