package com.example.students.service;

import com.example.students.entity.Student;
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

    List<Student> searchAll(String id, String studentName , String sex);

    List<Student> findByClassId(String id);

    void deleleAll(String[] ids);

}
