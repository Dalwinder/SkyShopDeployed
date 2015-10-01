package com.springapp.dao;

import com.springapp.model.Product;
import com.springapp.model.Supplier;

import java.util.List;

public interface SuppliersDao {
	public abstract Supplier createSupplier(Supplier supplier);
	public abstract Supplier updateSupplier(Supplier supplier);
	public abstract void cancelSupplier(Supplier supplier);
	public abstract List<Supplier> getSuppliers();
}
