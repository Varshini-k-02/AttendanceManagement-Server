package com.example.AttendanceManagement.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "users")
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long empId;
    private String email;
    private String pwd;
    private String role;
    public Long getId() {
        return id;
    }

    public Users(Long id, Long empId, String email, String pwd, String role) {
        this.id = id;
        this.empId = empId;
        this.email = email;
        this.pwd = pwd;
        this.role = role;
    }

    public Users() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
