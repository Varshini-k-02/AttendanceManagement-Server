package com.example.AttendanceManagement.model;


public class UserDTO {
    private Long id;
    private String email;
    private String pwd;
    private String role;
    public UserDTO() {
    }

    public UserDTO(EmployeeData data, Users user) {
        this.id = data.getId();
        this.email = user.getEmail();
        this.pwd = user.getPwd();
        this.role=user.getRole();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
