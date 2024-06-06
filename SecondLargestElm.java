package com.Arrays;

import java.util.Arrays;

public class SecondLargestElm {

	public static void main(String[] args) {
		
	        int i, largest, secondLargest;
	        int arr[] = { 21, 30, 11, 9, 44, 41 };
	        int arrSize = arr.length;
	        if (arrSize < 2)
	        {
	            System.out.println(" Input is Invalid ");
	            return;
	        }
	        largest = secondLargest = Integer.MIN_VALUE;
	        for(i = 0; i < arrSize; i++)
	        {
	            largest = Math.max(largest, arr[i]);
	        }
	        for(i = 0; i < arrSize; i++)
	        {
	            if (arr[i] != largest)
	                secondLargest = Math.max(secondLargest, arr[i]);
	        }
	        System.out.println("Second largest element is : "+ secondLargest);
	    }
		

}



