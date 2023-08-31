package com.example.AttendanceManagement.controller;

import com.example.AttendanceManagement.model.EmployeeAttendance;
import com.example.AttendanceManagement.model.EmployeeData;
import com.example.AttendanceManagement.repository.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JoinController {
    @Autowired
    private EmployeeDataRepository employeeDataRepository;

    @GetMapping("/joinData")
    public List<EmployeeData> getData() {
        List<EmployeeData> employeeData = employeeDataRepository.findAll();
        for(EmployeeData data:employeeData){
            System.out.println(data);
        }
        return employeeData;
    }

    @PostMapping("/post-join-data")

    public EmployeeData postData(@RequestBody EmployeeData employeeData){
        return employeeDataRepository.save(employeeData);
    }


}
