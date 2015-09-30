package com.springapp.model;

public class Discount {

    private int id;

    private String productCode;

    private int departmentId;
    private String departmentName;
    private int numberOfEmployees;

    public Discount(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.numberOfEmployees = 0;
    }

    public Discount(String departmentName) {
        this.departmentName = departmentName;
        this.numberOfEmployees  = 0;
    }

    //ID
    public int getDepartmentID() {
        return departmentId;
    }
    public void setDepartmentID(int departmentId) {
        this.departmentId = departmentId;
    }

    //DepartmentName
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    //NumberOfEmployees
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}