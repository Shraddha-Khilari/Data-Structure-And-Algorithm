package sorting;

import java.util.Scanner;

public class sort {
	
	
	
	//binary search
	public static int binarySearch(int arr[], int size ,int  key) {
		int left=0;
		int right= arr.length -1;
		
		while(left <= right) {
			
		
			int mid = (left +right)/2;
			
			if(arr[mid] == key) 
				return mid;
			
			else if(key > arr[mid] )
				left = mid +1;
			else
				right = mid -1;
		}		
		 return -1;
	}

	public static void main(String[] args) {
		
  int arr[]= {10,20,30,40,50,60,70,80,90,100};
  
  System.out.println("Enter key which you want to search:");
  Scanner sc = new Scanner(System.in);
  int key = sc.nextInt();
  
  int ret = binarySearch(arr,arr.length,key);
   if(key !=  -1)

   {
	   System.out.println("key found at: "+ret);
   }
   else 
	   System.out.println("key  not found ");
}
}
