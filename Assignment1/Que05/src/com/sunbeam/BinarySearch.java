package com.sunbeam;

import java.util.Scanner;

public class BinarySearch 
{
	public static int binarySearch(int arr[], int size, int key) 
	 {

	        int left = 0,right = size - 1;

	        while (left <= right) 
	        {
	            int mid = (right + left) / 2;

	            if(key == arr[mid]) 
	            {
	                return mid;
	            } 
	            else if(key > arr[mid]) 
	            {
	            	right = mid - 1;
	            }
	            else 
	            {
	            	left = mid + 1;
	            }
	        }

	        return -1;
	    }

	public static void main(String[] args)
	{
		
		int[] arr = {60, 50, 40, 30, 20, 10, 5, 1};
		
		System.out.print("Enter key to be searched : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		int res = binarySearch(arr, arr.length, key);
		
		if (res != -1) {
            System.out.println("Element found at index " +res);
        } else {
            System.out.println("Not found");
        }
    }
}