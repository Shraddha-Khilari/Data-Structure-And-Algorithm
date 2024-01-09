package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {
	
	public static int selectionSort(int arr[], int N) 
	{
		int comp =0;
		
		for(int i = 0 ; i < N-1 ; i++) 
		{
			for(int j = i + 1 ; j < N ; j++) 
			{
				if(arr[i] > arr[j])
				{
					comp++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return comp;
	}

	public static void main(String[] args) 
	{
		int arr[] = {44, 11, 55, 22, 66, 33};
		
		System.out.println("Before sort : " + Arrays.toString(arr));
		int comp=selectionSort(arr, arr.length);
		System.out.println("After sort : " + Arrays.toString(arr));
        System.out.println("Number of comparisons: " + comp);

	}

}