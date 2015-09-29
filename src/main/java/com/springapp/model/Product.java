package com.springapp.model;
import java.math.BigDecimal;

public class Product {

    private int id;

    private String productCode;

    private int productTypeId;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;

    public Product(int id, int tid, String productCode, String name, String description, BigDecimal price, String imageUrl) {
        this.id = id;
        this.productTypeId = tid;
        this.productCode = productCode;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public Product(int tid, String productCode, String name, String description, BigDecimal price, String imageUrl) {
        this.productTypeId = tid;
        this.productCode = productCode;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    //ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //ProductTyepId
    public int getProductTypeId() {
        return productTypeId;
    }
    public void setProdictTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    //ProductCode
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    //Price
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    //Name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Description
    public String getDescription() {
            return description;
        }
    public void setDescription(String description) {
            this.description = description;
        }

    //ImageURL
    public String getImageUrl() {
            return imageUrl;
        }
    public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

    //TODO:TOSTRING

}