package com.springapp.dao;
import java.util.List;

import com.springapp.model.Product;

public interface CatalogueDao {
	public abstract Product insertProduct(Product product);
	public abstract void updateProduct(Product product);
	public abstract void deleteProduct(Product product);
	//public abstract List getProducts();
}
