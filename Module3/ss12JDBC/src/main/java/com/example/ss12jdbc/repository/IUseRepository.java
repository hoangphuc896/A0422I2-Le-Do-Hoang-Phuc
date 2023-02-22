package com.example.ss12jdbc.repository;

import com.example.ss12jdbc.model.Users;

import java.util.List;

public interface IUseRepository {
    List<Users> findAll();

    Users findById(int id);

    void addNewUser(Users users);

    boolean updateUser(Users users);

    boolean deleterUser(int id);

    List<Users> SearchUser(String country);

    List<Users> sort();
}
