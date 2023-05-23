package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService implements StudentServiceIpml{

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
    public List<Student> searchAll(String id, String studentName, LocalDate birthDay, int age, String sex) {
        return studentRepository.findAllByIdContainingOrStudentNameContainingOrBirthDayContainingOrAgeContainingOrSexContaining(id, studentName, birthDay, age, sex);
    }

    @Override
    public List<Student> findByClassId(int id) {
        return studentRepository.findStudentByClassname_IdClass(id);
    }
}
