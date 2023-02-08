package com.liskovbookfix;

public class RegisteredUserPayment implements NewPayment, PreviousPayment {
	
	private String name;
	
	public RegisteredUserPayment(String name) {
		this.name = name;
	}

	@Override
	public void previousPaymentInfo() {
		System.out.println("Retrieving " + name + "'s last payment details.");
	}

	@Override
	public void newPayment() {
		System.out.println("Processing " + name + "'s current payment request.");
	}
	
	
}
