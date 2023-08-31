package com.example.AttendanceManagement.repository;

import com.example.AttendanceManagement.model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDataRepository extends JpaRepository<EmployeeData, Long> {
}
