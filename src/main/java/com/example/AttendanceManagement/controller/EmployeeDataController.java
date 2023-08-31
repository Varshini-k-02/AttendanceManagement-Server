package com.example.AttendanceManagement.controller;

import com.example.AttendanceManagement.model.EmployeeData;
import com.example.AttendanceManagement.repository.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeDataController {
    @Autowired
    private EmployeeDataRepository employeeRepository;
    @GetMapping("/data")
public List<EmployeeData> getEmpData() {
    List<EmployeeData> employeeData = employeeRepository.findAll();
    for(EmployeeData data:employeeData){
        System.out.println(data);
    }
    return employeeData;
}

    @PostMapping("/post-emp-data")
    public EmployeeData postEmpData(@RequestBody EmployeeData empAtt){
        return employeeRepository.save(empAtt);
    }


}
