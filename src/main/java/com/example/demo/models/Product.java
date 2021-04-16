package com.example.demo.models;

public class Product {
	
	//1.variables
	private int id; 
	private String title;
	private float price;
	private String manufacturer;
	private short amount;
	
	private static int idCounter = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}
	//TODO verification
	public void setPrice(float price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	//TODO verification
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public short getAmount() {
		return amount;
	}
	//TODO verification
	public void setAmount(short amount) {
		this.amount = amount;
	} 
	
	
	//2.get and ser
	//constructors
	public Product() {
		
	}
	
	public Product(String title, float price, String manufacturer, short amount) {
		this.title = title;
		this.price = price;
		this.manufacturer = manufacturer;
		this.amount = amount;
		setId();
	}
	//toString

	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", manufacturer=" + manufacturer
				+ ", amount=" + amount + "]";
	}
	
	

}
