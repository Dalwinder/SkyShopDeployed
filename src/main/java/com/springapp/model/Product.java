package com.springapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "tid")
	private int tid;
	
	public Product() {
	}

	public Product(int id, int tid, String code, String name) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.tid = tid;
	}
	
	public Product(int tid, String code, String name) {
		this.name = name;
		this.code = code;
		this.tid = tid;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.code = name;
	}
	
	@Override
	public String toString() {
		return "Product: " 	+ this.id
							+ ": " 
							+ this.tid 
							+ ", "  
							+ this.code 
							+ " " 
							+ this.name;
	}
	
}