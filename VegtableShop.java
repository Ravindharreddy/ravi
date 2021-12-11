package com.technoelevate.myjava8features;

public class VegtableShop {
	private String name;
	private double price;
	private int quantity;
	public VegtableShop(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	
	public Double getPrice() {
		double rem;
		rem=this.price % 100;
		return rem;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		return "VegtableShop [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
