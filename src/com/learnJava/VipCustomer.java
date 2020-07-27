package com.learnJava;

public class VipCustomer {
	// Fields
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	// 1st Constructor
	public VipCustomer() {
		this("Default VIP name", 1_000_000.00, "default-vip-address.com");
	}
	// 2nd Constructor
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "default-vip-address.com");
	}
	// 3rd Constructor
	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	// Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
