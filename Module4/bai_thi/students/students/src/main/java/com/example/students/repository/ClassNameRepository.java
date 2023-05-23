package com.example.students.repository;

import com.example.students.entity.ClassName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassNameRepository extends JpaRepository<ClassName ,String> {
}
