package com.springapp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.springapp.model.ProductImpl;

public class ProductDao implements DaoInterface<ProductImpl, String> {

	private Session currentSession;
	
	private Transaction currentTransaction;

	public ProductDao() {
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
		return sessionFactory;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void persist(ProductImpl entity) {
		getCurrentSession().save(entity);
	}

	public void update(ProductImpl entity) {
		getCurrentSession().update(entity);
	}

	public ProductImpl findById(int id) {
		ProductImpl product = (ProductImpl) getCurrentSession().get(ProductImpl.class, id);
		return product; 
	}

	//TODO
	public ProductImpl findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(ProductImpl entity) {
		getCurrentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<ProductImpl> findAll() {
		List<ProductImpl> products = (List<ProductImpl>) getCurrentSession().createQuery("from Products").list();
		return products;
	}

	public void deleteAll() {
		List<ProductImpl> entityList = findAll();
		for (ProductImpl entity : entityList) {
			delete(entity);
		}
	}
}
