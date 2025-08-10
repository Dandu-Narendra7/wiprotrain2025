package com.wipro.exceptiontest;

public class CustomExceptionTest {

	public static void main(String[] args) {
		checkMonth();
	}

	private void checkMonth(int monthNo) throws InvalidMonthException{
		if(monthNo>12 && monthNo<1) {
			throw InvalidMonthException
		}
		// TODO Auto-generated method stub
		
	}
}
