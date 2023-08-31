package com.example.AttendanceManagement.model;

import lombok.*;

import java.util.Date;


public class RangeDTO {
    private Long id;
    private Date startDate;
    private Date endDate;

    public RangeDTO() {
    }

    public Long getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public RangeDTO(EmployeeAttendance attendance, EmployeeData data) {
        this.id = data.getId();
        this.startDate=attendance.getLoggedInDate();
        this.endDate=attendance.getLoggedInDate();
    }
}
