package com.example.student.repository;

import com.example.student.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,String> {
    List<Student> findAllByIdContainingOrStudentNameContainingOrBirthDayContainingOrAgeContainingOrSexContaining(@Pattern(regexp = "SV-[0-9]") String id, @Size(min = 5, max = 40) String studentName, LocalDate birthDay, @Min(18) int age, String sex);
    List<Student> findStudentByClassname_IdClass(int classname_idClass);
}
