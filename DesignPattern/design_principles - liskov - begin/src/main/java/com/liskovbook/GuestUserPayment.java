package com.liskovbook;

public class GuestUserPayment implements Payment {

	private String name;

	public GuestUserPayment() {
	}
	
	public GuestUserPayment(String name) {
		this.name = name;
	}

	@Override
	public void previousPaymentInfo() {
		throw new UnsupportedOperationException();
	}

	@Override
	public void newPayment() {
		System.out.println("Processing " + name + "'s current payment request.");
	}

}
