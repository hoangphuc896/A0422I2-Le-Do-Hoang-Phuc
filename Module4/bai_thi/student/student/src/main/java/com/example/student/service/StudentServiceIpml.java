package com.example.student.service;

import com.example.student.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.util.List;

public interface StudentServiceIpml {
    Page<Student> findAll(Pageable pageable);

    void addNew(Student student);

    void update(Student student);

    void delete(String id);

    Student findById(String id);

    List<Student> searchAll(String id, String studentName, LocalDate birthDay, int age, String sex);

    List<Student> findByClassId(int id);
}
