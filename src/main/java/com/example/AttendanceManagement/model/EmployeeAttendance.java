package com.example.AttendanceManagement.model;
import jakarta.persistence.*;
import lombok.ToString;

import java.util.Date;
@ToString


@Entity
public class EmployeeAttendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long empId;
    @Temporal(TemporalType.DATE)
    private Date loggedInDate;

    public EmployeeAttendance() {
    }

    public EmployeeAttendance(Long id,Long empid, Date loggedInDate) {
        this.id = id;
        this.empId=empid;
        this.loggedInDate = loggedInDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }
    public Date getLoggedInDate() {
        return loggedInDate;
    }

    public void setLoggedInDate(Date loggedInDate) {
        this.loggedInDate = loggedInDate;
    }



}
