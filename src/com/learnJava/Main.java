package com.learnJava;

public class Main {
	/**
	 * Copy the Class_challenge project and create a new class VipCustomer It should
	 * have 3 fields: name, credit limit and email address
	 * 
	 * Create 3 constructors: - 1st constructor empty should call the constructor
	 * with 3 parameter with default values - 2nd constructor should pass on the two
	 * values it receive and add a default value for the third - 3rd constructor
	 * should save all fields
	 * 
	 * Create getters and setters
	 */
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.setAccountNumber(12345);
		bank.setBalance(10_000.00);
		bank.setCustomerEmail("abbassi.abdeladhim31791@gmail.com");
		bank.setCustomerName("Abdeladhim Abbassi");
		bank.setCustomerPhone("+216 54 867 610");

		System.out.println("/*--- Bank ---*/");
		System.out.println("Hello Mr " + bank.getCustomerName());
		System.out.println("You have: " + String.format("%.2f", bank.getBalance()) + "$ in your account");

		bank.depositFunds(5_000.00);
		bank.withdrawFunds(1_000.00);
		bank.withdrawFunds(17_000.00);

		System.out.println("/*--- VIP customer ---*/");
		VipCustomer firstVipCustomer = new VipCustomer();
		System.out.println("First VIP customer name: " + firstVipCustomer.getName());
		System.out.println(
				"First VIP customer credit limit = " + String.format("%.2f", firstVipCustomer.getCreditLimit()));
		System.out.println("First VIP customer email: " + firstVipCustomer.getEmailAddress());
		
		VipCustomer secondVipCustome = new VipCustomer("Eminem", 850_000_000.00);
		System.out.println("Second VIP customer name: " + secondVipCustome.getName());
		System.out.println(
				"Second VIP customer credit limit = " + String.format("%.2f", secondVipCustome.getCreditLimit()));
		System.out.println("Second VIP customer email: " + secondVipCustome.getEmailAddress());
		
		VipCustomer thirdVipCustomer = new VipCustomer("Lionel Messi", 250_000_000.00, "lionel.messi@gmail.com");
		System.out.println("Third VIP customer name: " + thirdVipCustomer.getName());
		System.out.println(
				"Third VIP customer credit limit = " + String.format("%.2f", thirdVipCustomer.getCreditLimit()));
		System.out.println("Third VIP customer email: " + thirdVipCustomer.getEmailAddress());
	}

}
