package com.sunbeam;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray 
{
	 public static void reverseArray(int arr[] ) 
	 {
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < arr.length; i++) 
	        {
	            stack.push(arr[i]);
	        }

	        for (int i = 0; i < arr.length; i++) 
	        {
	            arr[i] = stack.pop();
	        }
	    }
	
	public static void main(String[] args) 
	{
		int arr[]  = {111, 222, 333, 444, 555};

        System.out.println("Brfore Reversing Array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
	}

}
