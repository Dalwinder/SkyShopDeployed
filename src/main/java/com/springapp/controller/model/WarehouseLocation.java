package com.springapp.controller.model;

/**
 * Created by Jo on 27/09/2015.
 */
public class WarehouseLocation implements Location{
    private String row;
    private String shelf;


    public WarehouseLocation(String row, String shelf) {
        this.row = row;
        this.shelf = shelf;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }
}
