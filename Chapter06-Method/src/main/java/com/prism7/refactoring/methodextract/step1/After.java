package com.prism7.refactoring.methodextract.step1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ローカル変数がない場合
 */
public class After {

	class Order {
		public double getAmount() { return 0; }
	}
	
	private String name;
	private Vector<Order> orders = new Vector<Order>();
	
	void printOwing() {
		Enumeration<Order> e = this.orders.elements();
		double outstanding = 0.0;
		
		printBanner();

		while (e.hasMoreElements()) {
			After.Order order = e.nextElement();
			outstanding += order.getAmount();
		}
		System.out.println("name:" + name);
		System.out.println("amount:" + outstanding);
	}

	private void printBanner() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}
}
