package com.prism7.refactoring.methodextract.step1;

import java.util.Enumeration;
import java.util.Vector;

public class Before {

	class Order {
		public double getAmount() { return 0; }
	}
	
	private String name;
	private Vector<Order> orders = new Vector<Order>();
	
	void printOwing() {
		Enumeration<Order> e = this.orders.elements();
		double outstanding = 0.0;
		
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");

		while (e.hasMoreElements()) {
			Before.Order order = e.nextElement();
			outstanding += order.getAmount();
		}
		System.out.println("name:" + name);
		System.out.println("amount:" + outstanding);
	}
}
