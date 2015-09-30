package com.springapp.dao;

import com.springapp.model.Department;

import java.util.List;

public interface DepartmentsDaoImp {
	public abstract Department createDepartment(Department department);
	public abstract void updateDepartment(Department department);
	public abstract List getDepartments();
}
