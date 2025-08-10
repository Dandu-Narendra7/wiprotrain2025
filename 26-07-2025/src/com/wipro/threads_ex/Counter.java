package com.wipro.threads_ex;

public class Counter {
	 int count = 0;
	 
	 public synchronized  void increment() {
	        count++;
	    }
	 public int getCount() {
	        return count;
	    }
	 void run() {
		 
	 }
	public void setCount(int count) {
		this.count = count;
	}
	 


}
