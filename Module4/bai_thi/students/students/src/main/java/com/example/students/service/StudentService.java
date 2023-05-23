package com.example.students.service;

import com.example.students.entity.Student;
import com.example.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
@Transactional
public class StudentService implements StudentServiceIpml {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public void addNew(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(String id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(String id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> searchAll(String id, String studentName, String sex) {
        return studentRepository.findAllByIdContainingOrStudentNameContainingOrSexContaining(id, studentName, sex);
    }

    @Override
    public List<Student> findByClassId(String id) {
        return studentRepository.findStudentByClassname_IdClass(id);
    }

    @Override
    public void deleleAll(String[] ids) {
        studentRepository.deleteAllByIdIn(Arrays.asList(ids));
    }

}
