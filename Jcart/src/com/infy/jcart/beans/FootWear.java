package com.infy.jcart.beans;


public class FootWear {
	
	private Integer productId;
	private String company;
	private String productName;
	private Character idealFor;
	private String material;
	private Integer weight;
	private String description;
	private Boolean selected;
	private Double price;
	private Boolean idealImageCheck;	
	
	public Boolean getIdealImageCheck() {
		return idealImageCheck;
	}
	public void setIdealImageCheck(Boolean idealImageCheck) {
		this.idealImageCheck = idealImageCheck;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Character getIdealFor() {
		return idealFor;
	}
	public void setIdealFor(Character idealFor) {
		this.idealFor = idealFor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getSelected() {
		return selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	
	
}