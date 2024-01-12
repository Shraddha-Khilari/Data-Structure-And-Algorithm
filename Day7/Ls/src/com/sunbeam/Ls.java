package com.sunbeam;

import java.util.Scanner;

public class Ls {

	private static int LinearSearch(int[] arr, int size, int key) {
	//1.Traverse array from 0 to size-1 index
		for(int i = 0 ; i < size ; i++)
		{
			//2.Compare each element with key
			if(key == arr[i])
				
				//3.If key is matching then return index of element
				return i;
		}
		//4.If key is not matching 
		return -1;
	}
	
	public static void main(String[] args) {
	int arr[] = {11,44,33,77,22,99,66,88};
	
	System.out.println("Enter Key to be Searched : ");
	Scanner sc = new Scanner(System.in);
	
	int key = sc.nextInt();
	int result = LinearSearch(arr,arr.length,key);
	
	if (result != -1)
		
		System.out.println("Key is found " + result + " index");
	else 
		System.out.println("Key is not found");

	sc.close();
	}

}
