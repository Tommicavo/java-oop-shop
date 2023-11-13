package org.lessons.java.shop;

public class Prodotto {
	
	private int code;
	private String name;
	private String description;
	private double price;
	private double iva;
	
	// Constructor
	public Prodotto(int code, String name, String description, double price, double iva) {
		setCode(code);
		setName(name);
		setDescription(description);
		setPrice(price);
		setIva(iva);		
	}
	
	// Getters
	public String getCode() {
		return String.format("%08d", code);
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getIva() {
		return iva;
	}
	
	// Setters
	private void setCode(int code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setIva(double iva) {
		this.iva = iva;
	}
	
	// Methods
	public double getPricePlusIva() {
		return getPrice() + (getPrice() * getIva());
	}
	
	public String getFullName() {
		return getCode() + "-" + getName();
	}
	
	public String getPrettyIva() { 
		double iva = getIva() * 100;
		String strIva =  String.format("%.0f", iva);
		return strIva + '%';
	}
	
	// Override
	@Override
	public String toString() {
		return "PRODOTTO\n" +
				"Code: " + getCode() + '\n' +
				"Name: " + getName() + '\n' +
				"Description: " + getDescription() + '\n' +
				"Price (without iva): " + getPrice() + "€\n" +
				"Iva: " + getPrettyIva() + '\n' +
				"Sale Price: " + String.format("%.2f", getPricePlusIva()) + "€\n\n";
	}
}
