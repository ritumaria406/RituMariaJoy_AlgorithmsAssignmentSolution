package com.algorithmassignment.service;

public class LinearSearchImplementation {
	
	// This method is used to search the value in the array
	public int search(double value,double[] arr) {
		
			for(int i=0; i<arr.length;i++)
			{
				if(arr[i] == value)
				return i;
			}
			return -1;

		}
}
