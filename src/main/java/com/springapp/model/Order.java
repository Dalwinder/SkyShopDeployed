package com.springapp.model;

public class Order {

    private String addressLine1, addressLine2, addressLine3, postcode;


    public Order(String addressLine1, String addressLine2, String addressLine3, String postcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.postcode = postcode;
    }

    public Order(String addressLine1, String addressLine2, String postcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = "";
        this.postcode = postcode;
    }

    //Addressline1
    public String getAddressLine1() {
        return addressLine1;
    }
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    //Addressline2
    public String getAddressLine2() {
        return addressLine2;
    }
    public void setAddressLine2(String addressLine1) {
        this.addressLine2 = addressLine2;
    }

    //Addressline3
    public String getAddressLine3() {
        return addressLine3;
    }
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    //Postcode
    public String getPostCode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

}