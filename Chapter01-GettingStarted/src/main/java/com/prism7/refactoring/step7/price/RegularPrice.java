package com.prism7.refactoring.step7.price;

import com.prism7.refactoring.step7.Movie;

public class RegularPrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.REGULAR;
	}

	@Override
	public double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1.5;
		}
		return result;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}