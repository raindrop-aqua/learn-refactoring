package com.prism7.refactoring.step7.price;



public abstract class Price {
	public abstract int getPriceCode();

	public abstract double getCharge(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
}
