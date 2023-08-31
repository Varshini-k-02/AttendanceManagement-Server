package com.example.AttendanceManagement.controller;

import com.example.AttendanceManagement.model.EmployeeAttendance;
import com.example.AttendanceManagement.model.EmployeeData;
import com.example.AttendanceManagement.model.JoinDTO;
import com.example.AttendanceManagement.model.RangeDTO;
import com.example.AttendanceManagement.repository.EmployeeAttendanceRepository;
import com.example.AttendanceManagement.repository.EmployeeDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
//@RequestMapping("/employeeAttendance")
public class EmployeeAttendanceController {
    @Autowired
    private EmployeeAttendanceRepository employeeAttendanceRepository;

@GetMapping("/attendance")
public List<EmployeeAttendance> getAttendance() {
    List<EmployeeAttendance> attendanceData = employeeAttendanceRepository.findAll();
    for(EmployeeAttendance data:attendanceData){
        System.out.println(data);
    }
    return attendanceData;
}

    @PostMapping("/post-data")
    public EmployeeAttendance postAttendance(@RequestBody EmployeeAttendance empAtt){
        return employeeAttendanceRepository.save(empAtt);
    }
    @PostMapping("/post-all-data")
    public List<EmployeeAttendance> postAllAttendance(@RequestBody List<EmployeeAttendance> empAtt){
        return employeeAttendanceRepository.saveAll(empAtt);
    }
    @GetMapping("/attendance/{id}")
    public List<EmployeeAttendance> fetchAttendanceById(@PathVariable("id") Long id) {

        return employeeAttendanceRepository.findByEmpId(id);
    }

    @PostMapping("/attendance-by-id")
    public List<EmployeeAttendance> getAttendanceById(@RequestBody JoinDTO dto) {
        Long empid = dto.getId();
        return employeeAttendanceRepository.findByEmpId(empid);
    }
    @PostMapping("/attendance-by-logDate")
    public List<EmployeeAttendance> getAttendanceByLogDate(@RequestBody JoinDTO dto) {
        Date d = dto.getLoggedInDate();
        return employeeAttendanceRepository.findByLoggedInDate(d);
    }
    @PostMapping("/attendance-by-id-date")
    public List<EmployeeAttendance> getAttendanceByBothIdAndDate(@RequestBody JoinDTO dto){
        Long id = dto.getId();
        Date d = dto.getLoggedInDate();

        if(d == null){
            return employeeAttendanceRepository.findByEmpId(id);
        }else{
            return employeeAttendanceRepository.findByEmpIdAndLoggedInDate(id,d);
        }
    }
    @PostMapping("/attendance-by-range")
    public List<EmployeeAttendance> getAttendanceByDateRange(@RequestBody RangeDTO dto){
        Date d1=dto.getStartDate();
        Date d2=dto.getEndDate();
        return employeeAttendanceRepository.findByLoggedInDateBetween(d1,d2);
    }
//    @PutMapping("/update-emp")
//    public List<EmployeeAttendance> updateEmpAttendance(@RequestBody JoinDTO dto){
//        Long id=dto.getId();
//        Date logDate =dto.getLoggedInDate();
//
//
//
//    }

}
