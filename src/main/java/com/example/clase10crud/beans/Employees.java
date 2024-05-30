package com.example.clase10crud.beans;

import java.util.Date;

public class Employees {
    private int employeeId;
    private String firstname;
    private String lastname;
    private String email;
    private String hiredate;
    private int managerid;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public int getManagerid() {
        return managerid;
    }

    public void setManagerid(int managerid) {
        this.managerid = managerid;
    }
}

