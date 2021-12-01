package com.technoelevate.mock;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingLinkedListUsingIterator {
	private static LinkedList<Product> list =new LinkedList<Product>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1000,1,"WaterBottle");
		Product p2=new Product(1200,3,"Shampoo");
		Product p3=new Product(5000,1,"Mobile");
		
		LinkedList<Product> lst =new LinkedList<Product>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		getType();		
	}


	private static void getType() {
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			Product product=(Product) itr.next();
			System.out.println(product.getType()+" "+product.getQty()+" "+product.getPrice());
			
		}
	}

}
