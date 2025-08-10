package com.wipro.oop;

public class Hdfc implements BankOps {

	@Override
	public void deposit(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println("depositing" + amount+ " into hdfc account number "+ accNumber);

	}

	@Override
	public void withdraw(double amount, String accNumber) {
		// TODO Auto-generated method stub
		System.out.println("withdrawing" + amount+ "from hdfc account number "+ accNumber);

	}

}
