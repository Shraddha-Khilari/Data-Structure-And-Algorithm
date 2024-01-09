package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

	 public static int lslastOcc(int arr[], int size, int key) 
	 {
	        int lastOcc = 1; 

	        for (int i = 0; i < size; i++) 
	        {
	            if (arr[i] == key)
	            {
	            	lastOcc = i;  
	            }
	        }

	        return lastOcc;
	        
	    }
	 
	    public static void main(String[] args)
	    {
	        int[] arr = {4, 6, 3, 8, 6, 1, 6, 5};
	        
	        System.out.print("Enter key to be searched : ");
			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();

	        int res = lslastOcc(arr, arr.length, key);

	        if (res != 1) 
	        {
	            System.out.println("The last occurrence is at index " + res);
	        } 
	        else {
	            System.out.println("Key not found ");
	        }
	        
	    }
	}



