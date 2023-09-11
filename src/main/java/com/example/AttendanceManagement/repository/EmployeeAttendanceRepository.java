package com.example.AttendanceManagement.repository;

import com.example.AttendanceManagement.model.EmployeeAttendance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Date;
public interface EmployeeAttendanceRepository extends JpaRepository<EmployeeAttendance, Long> {
    List<EmployeeAttendance> findByEmpId(Long empId);
    List<EmployeeAttendance> findByLoggedInDate(Date d);
    List<EmployeeAttendance> findByEmpIdAndLoggedInDate(Long id,Date d);
    List<EmployeeAttendance> findByEmpIdAndLoggedInDateBetween(Long id, Date d1, Date d2);
}

