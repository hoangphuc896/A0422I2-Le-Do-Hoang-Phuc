package com.example.blog.service;

import com.example.blog.entity.Users;

import java.util.List;

public interface UserService {
    void create(Users users);
    List<Users> findAll();
}
