package com.prism7.refactoring.methodextract.step3;

import java.util.Enumeration;
import java.util.Vector;

/**
 * ローカル変数の再代入
 */
public class After {

	class Order {
		public double getAmount() { return 0; }
	}
	
	private String name;
	private Vector<Order> orders = new Vector<Order>();
	
	void printOwing() {
		printBanner();
		double outstanding = getOutstanding();
		printDetails(outstanding);
	}

	private double getOutstanding() {
		Enumeration<Order> e = orders.elements();
		double result = 0.0;
		while (e.hasMoreElements()) {
			Order order = e.nextElement();
			result += order.getAmount();
		}
		return result;
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
