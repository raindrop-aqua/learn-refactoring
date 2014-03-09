package com.prism7.refactoring.vertomethod.ex;

public class Step2 {

	private int quantity;
	private int itemPrice;
	
	public double getPrice() {
		final int basePrice = quantity * itemPrice;
		final double discountFactor;
		if (basePrice > 1000) {
			discountFactor = 0.95;
		} else {
			discountFactor = 0.98;
		}
		return basePrice * discountFactor;
	}
}
