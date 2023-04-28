package com.example.form.service;

import com.example.form.entity.Form;

import java.util.List;

public interface IFormService {
    List<Form> displayForm();

    void create(Form form);

    void update(Form form);

    void delete(String id);

    Form findById(String id);

    List<Form> search(String firsname ,String  phones);

    void deleteAll(String [] ids);
}
