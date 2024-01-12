package com.sunbeam;

import java.util.Arrays;

public class MergeSortMain {
	
	public static void mergeSort(int[] arr, int left, int right) {
		
		
		if(left>= right)
			return;
		int mid = (left+right)/2;
		mergeSort(arr,left,mid);
		mergeSort(arr,mid+1, right);
		int size = right-left+1;
		int temp []= new int[size];
				int i = left, j=mid+1, k= 0;
				while(i<=mid && j<= right) {
					if(arr[i]< arr[j]) {
						temp[k] = arr[i];
						i++;
						k++;
					}
					else {
						temp[k] = arr  [j];
						j++;
						k++;
					}
				}
				while(i <= mid) {
					temp[k] = arr[i];
					i++;
					k++;
				}
				while(j <= right) {
					temp[k] = arr[j];
					j++;
					k++;
				}
				
				for(i = 0 ; i < size ; i++){
					arr[left + i] = temp[i];
				}
			}

	public static void main(String[] args) {
		
		int arr[]= {6,1,9,3,7,2,8,4,5};
		
		System.out.println("before sort: "+Arrays.toString(arr));
		 mergeSort(arr,0,arr.length-1);
		System.out.println("After sort: "+Arrays.toString(arr));
	}

	
}
