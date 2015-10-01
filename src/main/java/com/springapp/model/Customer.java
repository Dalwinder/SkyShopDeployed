package com.springapp.model;

import java.util.List;

public class Customer {

    private int customerId;
    private String title, forename, surname;
    private Address address;
    private Department department; //is this correct?
    private String mobileNumber, landlineNumber;
    private String login;
    private Password password;


    public Customer(int customerId, String title, String forename, String surname, Address address, String mobileNumber, String landlineNumber, String login, Password password){
        this.customerId = customerId;
        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.landlineNumber = landlineNumber;
        this.login = login;
        this.password = password;
    }

    public Customer(String title, String forename, String surname, Address address, String mobileNumber, String landlineNumber, String login, Password password){
        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.landlineNumber = landlineNumber;
        this.login = login;
        this.password = password;
    }

    // id
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int customerId) { this.customerId = customerId; }

    // title
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    // forename
    public String getForename() { return forename; }
    public void setForename(String forename) { this.forename = forename; }

    // surname
    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    //address
    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }

    // city
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    // mobileNumber
    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    // landLineNumber
    public String getLandlineNumber() { return landlineNumber; }
    public void setLandLineNumber(String landlineNumber) { this.landlineNumber = landlineNumber; }

    // email
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // login
    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    // password
    public Password getPassword() { return password; }
    public void setPassword(Password password) { this.password = password; }

    // postSpecialOffers
    public boolean getPostSpecialOffers() { return postSpecialOffers; }
    public void setPostSpecialOffers(boolean postSpecialOffers) { this.postSpecialOffers = postSpecialOffers; }

    // emailNotification
    public boolean getEmailNotification() { return emailNotification; }
    public void setEmailNotification(boolean emailNotification) { this.emailNotification = emailNotification; }

    // smsNotification
    public boolean getSmsNotification() { return smsNotification; }
    public void setSmsNotification(boolean smsNotification) { this.smsNotification = smsNotification; }

    // emailSpecialOffers
    public boolean getEmailSpecialOffers() { return emailSpecialOffers; }
    public void setEmailSpecialOffers(boolean emailSpecialOffers) { this.emailSpecialOffers = emailSpecialOffers; }

    // smsSpecialOffers
    public boolean getSmsSpecialOffers() { return smsSpecialOffers; }
    public void setSmsSpecialOffers(boolean smsSpecialOffers) { this.smsSpecialOffers = smsSpecialOffers; }
}
