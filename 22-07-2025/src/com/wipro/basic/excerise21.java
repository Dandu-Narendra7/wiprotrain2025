package com.wipro.basic;

public class excerise21 {
	public static void main(String[] args) {
		String str="Wipro training sess";
		String []str1=str.split(" ");
				int len=0;
				int smallWord=999;
				String word="";
				for(int i=0;i<str1.length;i++) {
				len=str1[i].length();
				if(len<smallWord)
				{
				smallWord=str1[i].length();
				word=str1[i];
				}
				System.out.println(smallWord+" "+word);
				}
	}

}
