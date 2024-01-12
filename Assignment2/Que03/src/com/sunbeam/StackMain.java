package com.sunbeam;

public class StackMain {

	public static void main(String[] args) 
	{
		Stack stk = new Stack();
		
		stk.push(15);
		stk.push(16);
		stk.push(17);
		stk.push(18);
		stk.push(19);
		stk.push(20);
	
		System.out.println("1st Poped element: " + stk.peek());
		
		stk.pop();
		System.out.println("2nd Poped element: " + stk.peek());

		stk.pop();
		System.out.println("3rd Poped element: " + stk.peek());

		stk.pop();
		System.out.println("4th Poped element: " + stk.peek());

		stk.pop();
		System.out.println("5th Poped element: " + stk.peek());

		stk.pop();
		System.out.println("6th Poped element: " + stk.peek());



	}

}
