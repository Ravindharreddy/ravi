package com.technoelevate.mock;

import java.util.LinkedList;

public class IteratingLinkedListUsingForEachLoop {
			Product p1=new Product(1200,1,"Waterbottle");

	private static LinkedList<Product> list=new LinkedList<Product>();
	
	public static void main(String[] args) {
		Product p1=new Product(1000,1,"WaterBottle");
		Product p2=new Product(1200,3,"Shampoo");
		Product p3=new Product(5000,1,"Mobile");
		
		LinkedList<Product> lst =new LinkedList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		getPrice();
			
	}

	private static void getPrice() {
		for(Product p:list) {
			Product product=(Product) p;
			System.out.println(product.getPrice()+" "+product.getQty()+" "+product.getType());
		}
	}

}
