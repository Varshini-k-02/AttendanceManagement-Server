package com.example.AttendanceManagement.service;

import com.example.AttendanceManagement.model.EmployeeAttendance;
import com.example.AttendanceManagement.model.EmployeeData;
import com.example.AttendanceManagement.model.JoinDTO;
import com.example.AttendanceManagement.repository.EmployeeAttendanceRepository;
import com.example.AttendanceManagement.repository.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JoinService {
    private final EmployeeAttendanceRepository employeeAttendanceRepository;
    private final EmployeeDataRepository employeeDataRepository;

    @Autowired
    public JoinService(EmployeeAttendanceRepository employeeAttendanceRepository,
                           EmployeeDataRepository employeeDataRepository) {
        this.employeeAttendanceRepository = employeeAttendanceRepository;
        this.employeeDataRepository = employeeDataRepository;
    }

    public List<JoinDTO> getAllEmployeeDataWithAttendance() {
        List<JoinDTO> result = new ArrayList<>();
        List<EmployeeAttendance> attendances = employeeAttendanceRepository.findAll();

        for (EmployeeAttendance attendance : attendances) {
            Long employeeId = attendance.getEmpId();
            EmployeeData data = employeeDataRepository.findById(employeeId).orElse(null);

            if (data != null) {
                JoinDTO dto = new JoinDTO(attendance, data);
                result.add(dto);
            }
        }
        return result;
    }
}
