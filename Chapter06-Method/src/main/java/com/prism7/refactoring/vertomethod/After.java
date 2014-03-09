package com.prism7.refactoring.vertomethod;

public class After {

	private double quantity;
	private double itemPrice;
	
	public double getPrice() {
		if (basePrice() > 1000) {
			return basePrice() * 0.95;
		} else {
			return basePrice() * 0.98;
		}
	}

	private double basePrice() {
		return quantity * itemPrice;
	}
}
