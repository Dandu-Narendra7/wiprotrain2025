package com.wipro.opp.test;

import com.wipro.oop.Hdfc;
import com.wipro.oop.Citibank;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hdfc user1=new Hdfc();
		user1.deposit(400.0,"123er40");
		user1.deposit(200.0,"123er40");
		Citibank user2=new Citibank();
		user2.deposit(400.0,"123er40");
		user2.deposit(200.0,"123er40");
		

	}

}
