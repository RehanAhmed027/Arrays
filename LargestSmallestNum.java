package com.Arrays;

import java.util.Scanner;

public class LargestSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the size of array: ");
		      int n = sc.nextInt();
		      int arr[] = new int[n];
		      System.out.println("Enter " +n+ " array elements ");
		      for(int i=0; i<n; i++) {
		         arr[i] = sc.nextInt();
		      }
		      int largest = arr[0];
		      int smallest = arr[0];
		      for(int i=1;i<n;i++){
		      if(arr[i]>largest){
		            largest =arr[i];
		      }
		      if(arr[i]<smallest){
		            smallest = arr[i];
		      }
		    }
		    System.out.println(largest+" is largest and "+ smallest +" is smallest");
		  }   

	}


