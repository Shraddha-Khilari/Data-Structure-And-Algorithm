package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
	public  static void selectionSort(int[] arr, int length) {
	
		for(int i =0; i <= arr.length -1; i++) {
			for (int j=i; j <arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
	}

	
	public static void main(String[] args) {
		
		 int arr[]= {10,87,30,40,34,60,20,80,90,100};
		  System.out.println("before soring  :"+ Arrays.toString(arr));
		 
		  selectionSort(arr, arr.length);
		   
		   
			
			   System.out.println("after sort :" +Arrays.toString(arr));
		   
	}

	
}
