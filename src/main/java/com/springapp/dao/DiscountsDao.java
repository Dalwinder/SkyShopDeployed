package com.springapp.dao;

import com.springapp.model.Discount;

import java.util.List;

public interface DiscountsDao {
	public abstract Discount insertDiscount(Discount discount);
	public abstract void updateDiscount(Discount discount);
	public abstract void deleteDiscount(Discount discount);
	public abstract List getDiscounts();
}
