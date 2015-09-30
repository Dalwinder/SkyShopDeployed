package com.springapp.model;

import sun.security.util.Password;

public class Customer {

    private int customerId;
    private String title, forename, surname;
    private Address address;
    private Department department; //is this correct?
    private String mobileNumber, landlineNumber;
    private String login;
    private Password password;
    private boolean preferredContactEmail; //this needs changing

//
//    public Customer(int customerId, String title, String forename, String surname, Address address, Department department, String mobileNumber, String landlineNumber, String login, Password password, boolean securityLevel){
//        this.customerId = customerId;
//        this.title = title;
//        this.forename = forename;
//        this.surname = surname;
//        this.address = address;
//        this.mobileNumber = mobileNumber;
//        this.landlineNumber = landlineNumber;
//        this.login = login;
//        this.password = password;
//        this.preferredContactEmail = securityLevel;
//    }
//
//    public Customer(String title, String forename, String surname, Address address, Department department, String mobileNumber, String landlineNumber, String login, Password password, boolean securityLevel){
//        this.title = title;
//        this.forename = forename;
//        this.surname = surname;
//        this.address = address;
//        this.department = department;
//        this.mobileNumber = mobileNumber;
//        this.landlineNumber = landlineNumber;
//        this.login = login;
//        this.password = password;
//        this.preferredContactEmail = securityLevel;
//    }

    //EmployeeId
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int employeeId) {
        this.customerId = employeeId;
    }

    //gName
    public String getName() { return title + " " + forename + " " + surname;}
    public void setName(String title, String forename, String surname) {
        this.title = title;
        this.forename = forename;
        this.surname = surname;
    }

    //Address
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


    //MobileNumber
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    //LandlineNumber
    public String getLandlineNumber() {
        return landlineNumber;
    }
    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }

    //Login
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    //Password
    public void setPassword(Password password) {
        this.password = password;
    }

    //SecurityLevel
    public boolean getPreferredContact() {
        return preferredContactEmail;
    }
    public void setPreferredContact(boolean preferredContact) {
        this.preferredContactEmail = preferredContact;
    }
}