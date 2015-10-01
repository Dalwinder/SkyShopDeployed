package com.springapp.model;

public class ProductSupplier  implements Supplier{
    private int id;
    private String companyName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private int cityId;
    private String postCode;
    private String landLinePhoneNumber;

    @Override
    public String getAddress() {
        return null;
    }
}
