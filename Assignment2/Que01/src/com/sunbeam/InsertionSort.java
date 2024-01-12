package com.sunbeam;


import java.util.Arrays;

public class InsertionSort {
	
	public static int insertionSort(int arr[], int N) 
	{
		int comp=0;
		for(int i = 1 ; i < N ; i++) 
		{
			comp++;

			int temp = arr[i];
			int j;
			
			for(j = i - 1 ; j >= 0 && arr[j] > temp ; j--)
			{
				//comp++;

				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		return comp;
	}

	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
		int count = insertionSort(arr,arr.length);
		System.out.println("No of comparisons : "+count);

	}

}
