package com.example.students.repository;

import com.example.students.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,String> {
    List<Student> findAllByIdContainingOrStudentNameContainingOrSexContaining(@Pattern(regexp = "SV-[0-9]") String id, @Size(min = 5, max = 40) String studentName, String sex);
    List<Student> findStudentByClassname_IdClass(@Pattern(regexp = "[A-Z]-[0-9]") String classname_idClass);
    void deleteAllByIdIn(Collection<@Pattern(regexp = "SV-[0-9]{1}") String> id);
}
