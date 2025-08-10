package com.wipro.threadsex;

import java.util.Arrays;
import java.util.List;

public class Threads_ex2 {
	public static void main(String[] args) throws InterruptedException {
        List<String> names = Arrays.asList("Amit", "Jayanta", "esha");

        
        Thread vowelThread = new Thread(() -> {
            synchronized (names) {
                for (int i = 0; i < names.size(); i++) {
                    String name = names.get(i);
                    if (startsWithVowel(name)) {
                        names.set(i, name.toUpperCase());
                    }
                }
            }
        });

       
        Thread nonVowelThread = new Thread(() -> {
            synchronized (names) {
                for (int i = 0; i < names.size(); i++) {
                    String name = names.get(i);
                    if (!startsWithVowel(name)) {
                        names.set(i, name.toLowerCase());
                    }
                }
            }
        });

       
        vowelThread.start();
        nonVowelThread.start();

        
        vowelThread.join();
        nonVowelThread.join();

     
        System.out.println("Final List: " + names);
    }

  
    private static boolean startsWithVowel(String name) {
        if (name == null || name.isEmpty()) return false;
        char firstChar = Character.toLowerCase(name.charAt(0));
        return "aeiou".indexOf(firstChar) != -1;
    }
}


	