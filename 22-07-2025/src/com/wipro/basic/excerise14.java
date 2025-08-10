package com.wipro.basic;

public class excerise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 1, 2, 2, 3, 4, 4, 5};
		int[] arr1= {};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!= arr[i-1]) {
				
			for(int j=0;j<arr1.length;j++) {
				arr1[j]=arr[i];
				System.out.println(arr1[j]);
			}
				
			}
			
		}

	}

}
