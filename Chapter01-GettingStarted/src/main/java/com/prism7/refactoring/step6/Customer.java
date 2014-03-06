package com.prism7.refactoring.step6;

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
		Enumeration<Rental> rentals = this.rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		
		while (rentals.hasMoreElements()) {
			Rental rental = rentals.nextElement();
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
		}

		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " freqent renter points";
		return result;
	}
	
	public String htmlStatement() {
		Enumeration<Rental> rentals = this.rentals.elements();
		String result = "<h1>Rental Record for <em>" + getName() + "</em></h1><p>\n";
		
		while (rentals.hasMoreElements()) {
			Rental rental = rentals.nextElement();
			result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "<br>\n";
		}

		result += "<p>You owe <em>" + String.valueOf(getTotalCharge()) + "</em><p>\n";
		result += "On this ental you earned <em>" + String.valueOf(getTotalFrequentRenterPoints()) + "</em> freqent renter points<p>";
		return result;
	}
	
	private double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> rentals = this.rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental rental = rentals.nextElement();
			result += rental.getCharge();
		}
		return result;
	}
	
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration<Rental> rentals = this.rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental rental = rentals.nextElement();
			result += rental.getFrequentRenterPoints();
		}
		return result;
	}
}
