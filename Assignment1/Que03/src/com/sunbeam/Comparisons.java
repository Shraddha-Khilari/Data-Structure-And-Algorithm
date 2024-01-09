package com.sunbeam;

import java.util.Scanner;

public class Comparisons 
{
	public static int lscomp(int arr[], int size, int key) 
	 {
	        int comp = 0;

	        for (int i = 0; i < size; i++) 
	        {
	        	comp++;
	            if (arr[i] == key)
	            {
	            	return comp;  
	            }
	        }
			return comp;
	    }
	
	public static int bsComp(int arr[], int size, int key) 
	 {
	        int comp = 0;

	        int left = 0,right = size - 1;

	        while (left <= right) 
	        {
	        	comp++;
	            int mid = (left + right) / 2;

	            if(key == arr[mid]) 
	            {
	                return comp;
	            } 
	            else if(key < arr[mid]) 
	            {
	            	left = mid - 1;
	            }
	            else 
	            {
	            	left = mid + 1;
	            }
	        }

	        return comp;
	    }

	public static void main(String[] args) 
	{
		int[] arr = {4, 7, 3, 8, 6, 1, 3, 5};
		
		System.out.print("Enter key to be searched : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
	
        int lsccomp = lscomp(arr, arr.length, key);
        int bscomp = bsComp(arr, arr.length, key);

        System.out.println("Linear Search Comparisons: " + lsccomp);
        System.out.println("Binary Search Comparisons: " + bscomp);

	}

}
