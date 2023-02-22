package com.example.ss12jdbc.service;

import com.example.ss12jdbc.model.Users;

import java.util.List;

public interface Userservice {
    List<Users> findAll();

    Users findById(int id);

    void addNewUser(Users users);

    boolean updateUser(Users users);

    boolean deleterUser(int id);

    List<Users> SearchUser(String country);

    List<Users> sort();
}
