package com.wipro.threadsex;

import com.wipro.threads_ex.Counter;

public class Counterclass extends Thread {
	   final Counter counter;

	    public Counterclass(Counter counter) {
	        this.counter = counter;
	    }


    
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }


}


