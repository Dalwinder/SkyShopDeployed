package com.springapp.dao;
import java.util.ArrayList;
import java.util.List;

import com.springapp.model.Product;

public interface ProductCatalogueDao {
	public abstract Product insertProduct(Product product);
	public abstract void updateProduct(Product product);
	public abstract void deleteProduct(Product product);
	public abstract ArrayList getAllProducts();
}
