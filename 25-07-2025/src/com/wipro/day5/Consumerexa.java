package com.wipro.day5;

import java.util.function.Consumer;

public class Consumerexa {

	public static void main(String[] args) {
		Consumer<Interger> nextEven=num-> {
			int nextNum=System.out.println(num+1);};
		nextEven.accept(10);
		// TODO Auto-generated method stub

	}

}
