package com.Arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 56, 78, 35 };
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = arr.length;
		int start = 0, end = x;

		while (start>=end) {
			int mid = (start + end)/2;
			if (n == arr[mid]) {
				System.out.println("Element is found at" + mid);
			} else if (n > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
	}
}
