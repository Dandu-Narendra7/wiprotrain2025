package com.wipro.oop;

public class Citibank implements BankOps {

	@Override
	public void deposit(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println("depositing" + amount+ " citi account number "+ accNumber);

	}

	@Override
	public void withdraw(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println("withdrawing" + amount+ " account number "+ accNumber);

	}

}
