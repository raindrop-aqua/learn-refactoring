package com.prism7.refactoring.vertomethod;

public class Before {

	private double quantity;
	private double itemPrice;
	
	public double getPrice() {
		double basePrice = quantity * itemPrice;
		if (basePrice > 1000) {
			return basePrice * 0.95;
		} else {
			return basePrice * 0.98;
		}
	}
}
