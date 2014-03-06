package com.prism7.refactoring.step7;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("masahiro");
		{
			Movie m = new Movie("magi", Movie.NEW_RELEASE);
			Rental r = new Rental(m, 5);
			c.addRental(r);
		}
		System.out.println(c.statement());
		
	}

}
