package com.example.blog.repository;

import com.example.blog.entity.UserRole;
import com.example.blog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole , Long> {
    List<UserRole> findAllByUsers (Users users);
}
