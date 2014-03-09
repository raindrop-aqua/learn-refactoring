package com.prism7.refactoring.methodinline;

public class Before {

	private int numberOfLateDeliveries;
	
	int getRating() {
		return (moreThanFiveLateDeliveries()) ? 2 : 1;
	}

	private boolean moreThanFiveLateDeliveries() {
		return numberOfLateDeliveries > 5;
	}
}
