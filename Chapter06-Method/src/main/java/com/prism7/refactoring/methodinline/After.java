package com.prism7.refactoring.methodinline;

/**
 * メソッドのインライン化
 */
public class After {

	private int numberOfLateDeliveries;
	
	int getRating() {
		return (numberOfLateDeliveries > 5) ? 2 : 1;
	}
}
