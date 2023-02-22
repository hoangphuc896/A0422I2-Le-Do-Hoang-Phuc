package com.example.ss12jdbc.service;

import com.example.ss12jdbc.model.Users;
import com.example.ss12jdbc.repository.UseRepositoryImpl;

import java.util.List;

public class UserserviceImpl implements Userservice {
    UseRepositoryImpl useRepository = new UseRepositoryImpl();

    @Override
    public List<Users> findAll() {
        return useRepository.findAll();
    }

    @Override
    public Users findById(int id) {
        return useRepository.findById(id);
    }

    @Override
    public void addNewUser(Users users) {
        useRepository.addNewUser(users);
    }

    @Override
    public boolean updateUser(Users users) {
        return useRepository.updateUser(users);
    }

    @Override
    public boolean deleterUser(int id) {
        return useRepository.deleterUser(id);
    }

    @Override
    public List<Users> SearchUser(String country) {
        return useRepository.SearchUser(country);
    }

    @Override
    public List<Users> sort() {
        return useRepository.sort();
    }

}
