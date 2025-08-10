package com.wipro.threadsex;

import com.wipro.threads_ex.Counter;

public class CounterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Counter counter = new Counter();

	        Counterclass t1 = new Counterclass(counter);
	        Counterclass t2 = new Counterclass(counter);

	        t1.start();
	        t2.start();

	        
	        try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	        System.out.println("Final count: " + counter.getCount());
	}

	       
	    }

	


