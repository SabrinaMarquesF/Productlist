package com.devsuperior.demo.entities;

public class Products { 
	
	private Long id;
	private String name;
	private int price;
	
	private Departaments departments;
	
	public Products() {
		
	}
	

	public Products(Long id, String name, int i, Departaments departments) {
		super();
		this.id = id;
		this.name = name;
		this.price = i;
		this.departments = departments;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Departaments getDepartments() {
		return departments;
	}

	public void setDepartments(Departaments departments) {
		this.departments = departments;
	}

}