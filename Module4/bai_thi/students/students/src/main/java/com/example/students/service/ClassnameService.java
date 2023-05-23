package com.example.students.service;

import com.example.students.entity.ClassName;
import com.example.students.repository.ClassNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassnameService implements ClassnameServiceImpl {
    @Autowired
    private ClassNameRepository classNameRepository;

    @Override
    public List<ClassName> findAll() {
        return classNameRepository.findAll();
    }

    @Override
    public void create(ClassName className) {
    classNameRepository.save(className);
    }

    @Override
    public void update(ClassName className) {
        classNameRepository.save(className);
    }

    @Override
    public void delete(String id) {
        classNameRepository.deleteById(id);
    }

    @Override
    public ClassName findById(String id) {
        return classNameRepository.findById(id).orElse(null);
    }
}
