package com.example.AttendanceManagement.model;

import jakarta.persistence.*;
import lombok.ToString;
import java.util.Date;

@Entity
@ToString
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String company;

    public EmployeeData() {
    }

    public EmployeeData(Long id, String name, Date dob, String company) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dob;
        this.company = company;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
