package com.springapp.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jo on 27/09/2015.
 */
public class Catalogue {

    private static Catalogue catalogue = new Catalogue();
    private List<Product> products;

    private Catalogue(){
        products = new ArrayList<Product>();
    }

    public static Catalogue getCatalogue(){
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

    public void addListOfProducts(ArrayList<Product> productList){
        for (int i = 0; i < productList.size(); i++){
            products.add(productList.get(i));
        }
    }

    public void removeAllProducts(){
        products.clear();
    }
}
