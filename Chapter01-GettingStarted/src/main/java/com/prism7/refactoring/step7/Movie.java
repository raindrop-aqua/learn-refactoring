package com.prism7.refactoring.step7;

import com.prism7.refactoring.step7.price.ChildrensPrice;
import com.prism7.refactoring.step7.price.NewReleasePrice;
import com.prism7.refactoring.step7.price.Price;
import com.prism7.refactoring.step7.price.RegularPrice;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 1;
	public static final int NEW_RELEASE = 0;
	
	private String title;
	private Price price;

	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDRENS:
			price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("不正な料金コード");
		}
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
}
