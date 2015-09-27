package com.springapp.service;

import com.springapp.dao.EmployeeDao;
import com.springapp.model.EmployeeImpl;

import java.util.List;

public class EmployeeService {

	private static EmployeeDao employeeDao;

	public EmployeeService() {
		employeeDao = new EmployeeDao();
	}

	public void persist(EmployeeImpl entity) {
		employeeDao.openCurrentSessionwithTransaction();
		employeeDao.persist(entity);
		employeeDao.closeCurrentSessionwithTransaction();
	}

	public void update(EmployeeImpl entity) {
		employeeDao.openCurrentSessionwithTransaction();
		employeeDao.update(entity);
		employeeDao.closeCurrentSessionwithTransaction();
	}

	public EmployeeImpl findById(String id) {
		employeeDao.openCurrentSession();
		EmployeeImpl employee = employeeDao.findById(id);
		employeeDao.closeCurrentSession();
		return employee;
	}

	public void delete(String id) {
		employeeDao.openCurrentSessionwithTransaction();
		EmployeeImpl employee = employeeDao.findById(id);
		employeeDao.delete(employee);
		employeeDao.closeCurrentSessionwithTransaction();
	}

	public List<EmployeeImpl> findAll() {
		employeeDao.openCurrentSession();
		List<EmployeeImpl> employees = employeeDao.findAll();
		employeeDao.closeCurrentSession();
		return employees;
	}

	public void deleteAll() {
		employeeDao.openCurrentSessionwithTransaction();
		employeeDao.deleteAll();
		employeeDao.closeCurrentSessionwithTransaction();
	}

	public EmployeeDao employeeDao() {
		return employeeDao;
	}
}
