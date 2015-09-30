package com.springapp.model;
import java.math.BigDecimal;

public class Product {

    private int id;

    private String productCode;
    private int productTypeId;
    private String name;
    private String shortDescription;
    private String longDescription;
    private BigDecimal price;
    private String imageUrl;
    private String rowLocation;
    private String shelfLocation;
    private int reOrderLevel; // Type?
    private int stockLevel;
    private boolean discontinued;



    public Product(int id, int tid, String productCode, String name, String shortDescription, String longDescription, BigDecimal price, String imageUrl, String rowLocation, String shelfLocation, int reOrderLevel, int stockLevel, boolean discontinued) {
        this.id = id;
        this.productTypeId = tid;
        this.productCode = productCode;
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rowLocation = rowLocation;
        this.shelfLocation = shelfLocation;
        this.reOrderLevel = reOrderLevel;
        this.stockLevel = stockLevel;
        this.discontinued = discontinued;
    }

    public Product(int tid, String productCode, String name, String shortDescription, String longDescription, BigDecimal price, String imageUrl, String rowLocation, String shelfLocation, int reOrderLevel, int stockLevel, boolean discontinued) {
        this.productTypeId = tid;
        this.productCode = productCode;
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.price = price;
        this.imageUrl = imageUrl;
        this.rowLocation = rowLocation;
        this.shelfLocation = shelfLocation;
        this.reOrderLevel = reOrderLevel;
        this.stockLevel = stockLevel;
        this.discontinued = discontinued;
    }

    //ID
    public int getId(){ return id; }
    public void setId(int id) { this.id = id; }

    //ProductTyepId
    public int getProductTypeId() { return productTypeId; }
    public void setProdictTypeId(int productTypeId) { this.productTypeId = productTypeId; }

    //ProductCode
    public String getProductCode() { return productCode; }
    public void setProductCode(String productCode) { this.productCode = productCode; }

    //Name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // shortDescription
    public String getShortDescription() { return shortDescription; }
    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }

    // longDescription
    public String getLongDescription() { return longDescription; }
    public void setLongDescription(String longDescription) { this.longDescription = longDescription; }

    //Price
    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    //ImageURL
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }


    // rowLocation
    public String getRowLocation() {return rowLocation; }
    public void setRowLocation(String rowLocation) { this.rowLocation = rowLocation; }

    // shelfLocation
    public String getshelfLocation() { return shelfLocation; }
    public void setShelfLocation(String shelfLocation) { this.shelfLocation = shelfLocation; }

    // reOrderLevel
    public int getReOrderLevel() { return reOrderLevel; }
    public void setReOrderLevel(int reOrderLevel) {this.reOrderLevel = reOrderLevel; }

    // stockLevel
    public int getStockLevel() { return stockLevel; }
    public void setStockLevel(int stockLevel) {this.stockLevel = stockLevel; }

    // discontinued
    public boolean getDiscontinued() { return discontinued; }
    public void setDiscontinued(boolean discontinued) {this.discontinued = discontinued; }

    //TODO:TOSTRING

}