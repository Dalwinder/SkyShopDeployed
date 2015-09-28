package com.springapp.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class EmployeeImpl implements Employee{

	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "title")
	private String title;

	@Column(name = "Forename")
	private String forename;
	
	@Column(name = "Surname")
	private String surname;
	
	public EmployeeImpl() {
	}

	public EmployeeImpl(String id, String title, String forename, String surname) {
		this.id = id;
		this.title = title;
		this.forename = forename;
		this.surname = surname;
	}
	
	public EmployeeImpl(String title, String forename, String surname) {
		this.title = title;
		this.forename = forename;
		this.surname = surname;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getForename() {
		return forename;
	}
	
	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Employee: " + this.id 
							+ ": " 
							+ this.title 
							+ " "  
							+ this.forename 
							+ " " 
							+ this.surname;
	}
	
}