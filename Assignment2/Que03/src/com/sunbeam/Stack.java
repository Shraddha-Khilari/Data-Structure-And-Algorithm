package com.sunbeam;

public class Stack 
{
	private int arr[];
	private int top;
	private final int SIZE ;
	
	public Stack() 
	{
		SIZE = 6;
		arr = new int[SIZE];
		top = SIZE;
	}
	
	public void push(int value) 
	{
		top--;
		arr[top] = value;
	}
	
	public int pop()
	{
		return arr[top++];
	}
	
	public int peek() 
	{
		return arr[top];
	}
	
	
	
}