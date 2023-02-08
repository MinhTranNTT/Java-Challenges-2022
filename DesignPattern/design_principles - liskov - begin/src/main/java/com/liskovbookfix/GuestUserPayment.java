package com.liskovbookfix;

public class GuestUserPayment implements NewPayment {

	private String name;

	public GuestUserPayment() {
	}
	
	public GuestUserPayment(String name) {
		this.name = name;
	}

	@Override
	public void newPayment() {
		System.out.println("Processing " + name + "'s current payment request.");
	}

}
