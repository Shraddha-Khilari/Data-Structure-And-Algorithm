package sorting;

import java.util.Scanner;

public class Linearsearch {

	public static int linearSearch(int[] arr, int size, int key) {
		
		
		for(int i = 0; i< size; i++) {
			if (key == arr[i])
			
			 return i;
		}
		return -1;
	}


	public static void main(String[] args) {
	
		 int arr[]= {10,20,30,40,50,60,70,80,90,100};
		 
		 System.out.println("Enter key which you want to search:");
		  Scanner sc = new Scanner(System.in);
		  int key = sc.nextInt();
		  
		   int ret = linearSearch(arr, arr.length, key);
		   
		   if(ret != -1) {
			   System.out.println("key is found at " + ret + " index");
		   }
		   else
		   {
			   System.out.println("key is not found :");
		   }
	}

}
