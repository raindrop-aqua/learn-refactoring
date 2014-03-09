package com.prism7.refactoring.variableinline;

public class Before {

	class Order {
		public double basePrice() { return 0; }
	}
	
	boolean sample() {
		Order anOrder = new Order();
		double basePrice = anOrder.basePrice();
		return (basePrice > 1000);
	}
}
