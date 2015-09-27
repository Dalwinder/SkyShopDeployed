package com.springapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jo on 27/09/2015.
 */
public class ProductCatalogue implements Catalogue{

    private static ProductCatalogue catalogue = new ProductCatalogue();
    private List<Product> products;

    private ProductCatalogue(){
        products = new ArrayList<Product>();
        products.add(new ProductImpl(1, 1, "hwufhei", "Gnome",  "a gnome", new BigDecimal(1.00), "aURL"));
        products.add(new ProductImpl(2, 2, "fuwhfi", "SpecialGnome",  "another gnome", new BigDecimal(1.00), "aURL"));
    }

    public static ProductCatalogue getCatalogue(){
        return catalogue;
    }

    public List<Product> getProducts(){
        return products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

}
