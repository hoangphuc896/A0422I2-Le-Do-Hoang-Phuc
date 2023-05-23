package com.example.form.service;

import com.example.form.entity.Form;
import com.example.form.repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Service
@Transactional
public class FormServiceImpl implements IFormService {

    @Autowired
    private FormRepository repository;

    @Override
    public List<Form> displayForm() {
        return repository.findAll();
    }

    @Override
    public void create(Form form) {
        repository.save(form);
    }

    @Override
    public void update(Form form) {
        repository.save(form);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public Form findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Form> search(String firsname, String phones) {
        return repository.findAllByFirstNameContainingOrPhonesContaining(firsname ,phones);
    }

    @Override
    public void deleteAll(String[] ids) {
        repository.deleteAllByIdIn(Arrays.asList(ids));
    }
}
