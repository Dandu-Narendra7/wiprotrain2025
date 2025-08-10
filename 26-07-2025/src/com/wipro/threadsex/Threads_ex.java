package com.wipro.threadsex;

public class Threads_ex{
    public static void main(String[] args) {
        Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        });

        Thread letterThread = new Thread(() -> {
            for (char c = 'A'; c <= 'J'; c++) {
                System.out.println(c);
                try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        });

        numberThread.start();
        letterThread.start();

        try {
            numberThread.join();
            letterThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

      
    }
}
