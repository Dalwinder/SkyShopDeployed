package com.springapp.service;

import com.springapp.dao.ProductDao;
import com.springapp.model.ProductImpl;

import java.util.List;

public class ProductService {

	private static ProductDao productDao;

	public ProductService() {
		productDao = new ProductDao();
	}

	public void persist(ProductImpl entity) {
		productDao.openCurrentSessionwithTransaction();
		productDao.persist(entity);
		productDao.closeCurrentSessionwithTransaction();
	}

	public void update(ProductImpl entity) {
		productDao.openCurrentSessionwithTransaction();
		productDao.update(entity);
		productDao.closeCurrentSessionwithTransaction();
	}

	public ProductImpl findById(int id) {
		productDao.openCurrentSession();
		ProductImpl product = productDao.findById(id);
		productDao.closeCurrentSession();
		return product;
	}

	public void delete(int id) {
		productDao.openCurrentSessionwithTransaction();
		ProductImpl product = productDao.findById(id);
		productDao.delete(product);
		productDao.closeCurrentSessionwithTransaction();
	}

	public List<ProductImpl> findAll() {
		productDao.openCurrentSession();
		List<ProductImpl> products = productDao.findAll();
		productDao.closeCurrentSession();
		return products;
	}

	public void deleteAll() {
		productDao.openCurrentSessionwithTransaction();
		productDao.deleteAll();
		productDao.closeCurrentSessionwithTransaction();
	}

	public ProductDao productDao() {
		return productDao;
	}
}
