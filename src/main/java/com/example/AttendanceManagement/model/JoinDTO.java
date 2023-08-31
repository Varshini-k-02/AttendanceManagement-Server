package com.example.AttendanceManagement.model;


import java.util.Date;

public class JoinDTO {
    private Long id;
    private String name;
    private Date dateOfBirth;
    private String company;
    private Date loggedInDate;

    public JoinDTO() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLoggedInDate(Date loggedInDate) {
        this.loggedInDate = loggedInDate;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCompany() {
        return company;
    }

    public Date getLoggedInDate() {
        return loggedInDate;
    }

    public JoinDTO(EmployeeAttendance attendance, EmployeeData data) {
        this.id = data.getId();
        this.name = data.getName();
        this.dateOfBirth = data.getDateOfBirth();
        this.company = data.getCompany();
        this.loggedInDate = attendance.getLoggedInDate();
    }
}
