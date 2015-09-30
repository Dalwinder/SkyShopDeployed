package com.springapp.dao;

import com.springapp.model.Product;

public interface SuppliersDaoImp {
	public abstract Product insertProduct(Product product);
	public abstract void updateProduct(Product product);
	public abstract void deleteProduct(Product product);
	//public abstract List getProducts();
}
