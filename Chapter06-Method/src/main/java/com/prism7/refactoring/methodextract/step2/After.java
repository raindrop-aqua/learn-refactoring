package com.prism7.refactoring.methodextract.step2;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ローカル変数を使う場合
 */
public class After {

	class Order {
		public double getAmount() { return 0; }
	}
	
	private String name;
	private Vector<Order> orders = new Vector<Order>();
	
	void printOwing() {
		Enumeration<Order> e = orders.elements();
		double outstanding = 0.0;
		
		printBanner();
		
		while (e.hasMoreElements()) {
			Order order = e.nextElement();
			outstanding += order.getAmount();
		}
		printDetails(outstanding);
	}
	
	private void printBanner() {
		System.out.println("*************************");
		System.out.println("***** Customer Owes *****");
		System.out.println("*************************");
	}
	
	private void printDetails(double outstanding) {
		System.out.println("name:" + name);
		System.out.println("amount:" + outstanding);
	}
}
