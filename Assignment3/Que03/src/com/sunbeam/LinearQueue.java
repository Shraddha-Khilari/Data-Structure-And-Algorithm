package com.sunbeam;

public class LinearQueue 
{
	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	
	public LinearQueue(int size) 
	{
		SIZE = size;
		arr = new int [SIZE];
		front = 0;
		rear = 0;
	}
	
	public void push(int value)
	{
		if (isFull()) 
		{
            System.out.println("Queue is full cannot push");
            return;
        }
		
		arr[rear] = value;
		rear++;
	}
	
	public void pop()
	{
		 if (isEmpty()) 
		 {
	            System.out.println("Queue is empty cannot pop");
	           
	     }
		front++;
	}
	
	public int peek()
	{
		if (isEmpty()) 
		 {
	            System.out.println("Queue is empty cannot peek ");
	           
	     }
		return arr[front];
	}
	
	public boolean isEmpty()
	{
		return front == rear;
	}
	
	public boolean isFull()
	{
		return rear == SIZE-1;
	}

}
