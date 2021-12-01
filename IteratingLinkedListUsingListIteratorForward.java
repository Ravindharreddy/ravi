package com.technoelevate.mock;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingLinkedListUsingListIteratorForward {
	private static LinkedList<Product> list =new LinkedList<Product>();


	public static void main(String[] args) {
		Product p1=new Product(1000,1,"WaterBottle");
		Product p2=new Product(1200,3,"Shampoo");
		Product p3=new Product(5000,1,"Mobile");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		getPrice();		
}


	private static void getPrice() {
		ListIterator itr=list.listIterator();
		while(itr.hasNext()) {
			Product product=(Product) itr.next();
			System.out.println(product.getType()+" "+product.getQty()+" "+product.getPrice());
			
		}
		
	}

}
