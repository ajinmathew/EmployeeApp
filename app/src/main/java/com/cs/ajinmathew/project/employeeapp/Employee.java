package com.cs.ajinmathew.project.employeeapp;

public class Employee {

    String name;
    String code;
    String designation;
    float salary;
    String company_name;
    String place;
    String district;
    String emilid;
    long mobile;

    public Employee() {
    }

    public Employee(String name, String code, String designation, float salary, String company_name, String place, String district, String emilid, long mobile) {
        this.name = name;
        this.code = code;
        this.designation = designation;
        this.salary = salary;
        this.company_name = company_name;
        this.place = place;
        this.district = district;
        this.emilid = emilid;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getEmilid() {
        return emilid;
    }

    public void setEmilid(String emilid) {
        this.emilid = emilid;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
