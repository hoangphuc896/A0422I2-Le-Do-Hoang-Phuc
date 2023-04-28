package com.example.form.repository;

import com.example.form.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FormRepository extends JpaRepository<Form, String> {
    List<Form> findAllByFirstNameContainingOrPhonesContaining(String firstname, String phones);
    void deleteAllByIdIn(String [] ids);
}
