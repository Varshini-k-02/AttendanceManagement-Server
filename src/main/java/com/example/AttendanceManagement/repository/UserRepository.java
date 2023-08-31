package com.example.AttendanceManagement.repository;

import com.example.AttendanceManagement.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {
    List<Users> findByEmpId(Long id);
    Users findByEmailAndPwd(String email,String pwd);
}
