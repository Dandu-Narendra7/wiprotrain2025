package com.wipro.basic;

public class excerise18 {

//
//public static void main(String[] args) {
//		
//		String s = "arora";
//		String rev = "";
//		for (int i = s.length()-1; i >=0 ; i--) 
//			rev=rev+s.charAt(i);
//		if(s.equals(rev)) {
//			System.out.println("String is palindrome");}
//		else { 
//			System.out.println("String is not palindrome");}
//
//	}
//
//}
 public static void main(String[] args) {
	 StringBuilder s=new StringBuilder("nare") ;
	 s.reverse();
	 String reversed = s.toString();
	 System.out.println(s);
	 
	
}


}
