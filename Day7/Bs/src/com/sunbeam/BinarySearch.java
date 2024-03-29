package com.sunbeam;

import java.util.Scanner;

public class BinarySearch {
	
	public static int BinarySearch(int[] arr, int size, int key) {
		
		int left = 0, right = size - 1;
		while(left <= right)
		{
			int mid = (left + right)/2;
			
			if(key == arr[mid])
				return mid;
			else if(key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55,66,77,88,99};
		
		System.out.println("Enter Key to be searched : ");
		Scanner sc = new Scanner(System.in);
		
		int key = sc.nextInt();
		int result = BinarySearch(arr,arr.length,key);
		
		if(result != -1)
			System.out.println("Key is found at " + result + " index");
		else
			System.out.println("Key is not found");
		sc.close();
	}

}
