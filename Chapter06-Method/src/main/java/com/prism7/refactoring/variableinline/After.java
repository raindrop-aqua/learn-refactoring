package com.prism7.refactoring.variableinline;

/**
 * 一時変数のインライン化
 */
public class After {

	class Order {
		public double basePrice() { return 0; }
	}
	
	boolean sample() {
		Order anOrder = new Order();
		return (anOrder.basePrice() > 1000);
	}
}
