package com.remove_duplicate;

import java.util.Arrays;

public class susobhan {
	public static void main(String [] args) {
		int arr []= {1,1,3,3,6,7,8,9,9};
		int n= arr.length;
		int arr2[]= new int[12];
		
		int j =0;
		
		for(int i=0;i<n-1;i++) {
			
			if(arr[i]!=arr[i+1])
			{
				arr2[j]=arr[i];
				j++;
			}
			      
		}
		for(int i=0;i<n-1;i++) {
			System.out.print(arr2[i]+" ");
			
		}
		Arrays.sort(arr2);
		int z=arr2.length;
//		for(int i=0;i<z;i++) {
//			System.out.println(arr2[i]);
//			
//			
//			
//		}
		System.out.println("the second largest no is "+arr2[z-2]);
		
		
	}

} 
