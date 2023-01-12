package com.assignemt5.model;

public class Guest {
	
	private int id;
	private String name;
	private String town;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	@Override
	public String toString() {
		return "Guest [id=" + id + ", name=" + name + ", town=" + town + "]";
	}
	

}
