package com.prism7.refactoring.step2;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String name;
	private Vector<Rental> rentals = new Vector<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	}

	public String getName() {
		return name;
	}
	
	public String statement() {
		double totalAmount = 0;
		int frequentRentarPoints = 0;
		Enumeration<Rental> rentals = this.rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		
		
		while (rentals.hasMoreElements()) {
			double thisAmount = 0;
			Rental each = rentals.nextElement();

			thisAmount = amountFor(each);

			frequentRentarPoints++;
			if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE && each.getDaysRented() > 1) {
				frequentRentarPoints++;
			}
			
			result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}

		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRentarPoints) + " freqent renter points";
		return result;
	}

	private double amountFor(Rental aRental) {
		double result = 0;
		switch (aRental.getMovie().getPriceCode()) {
		case Movie.REGULAR:
			result += 2;
			if (aRental.getDaysRented() > 2) {
				result += (aRental.getDaysRented() - 2) * 1.5;
			}
			break;
		case Movie.NEW_RELEASE:
			result += aRental.getDaysRented() * 3;
			break;
		case Movie.CHILDRENS:
			result += 1.5;
			if (aRental.getDaysRented() > 3) {
				result += (aRental.getDaysRented() - 3) * 1.5;
			}
			break;
		}
		return result;
	}
}
