package com.wipro.basic;

public class excerise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,19,2,6};
		int target=9;
		int[] out;
		for(int i=0;i<arr.length;i++) {
			if(((i+1)<arr.length)&&(arr[i]+arr[i+1]==target))
			{
			out[0]=i;
			out[1]=i+1;
				
			}
			}
		System.out.println(out[0]+"  "+ out[1]);
		}
	}


