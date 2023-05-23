package com.example.students.validate;

import com.example.students.entity.Student;
import com.example.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class Validate implements Validator {
    @Autowired
    StudentService service;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        if (!(target instanceof Student)) {
            return;
        }
        Student student = (Student) target;
        if (service.findById(student.getId()) != null) {
            errors.rejectValue("id", "create.duplicateId", new String[]{student.getId()},"ID bị trùng lặp");
        }

    }
}
