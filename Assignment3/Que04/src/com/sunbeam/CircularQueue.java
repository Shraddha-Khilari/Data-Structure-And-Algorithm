package com.sunbeam;

public class CircularQueue 
{
	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	private int count; 
	
	public CircularQueue(int size) 
	{
		SIZE = size;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
		count = 0;
	}
	
	public void push(int value) 
	{
		if (isFull()) {
            System.out.println("Queue is full cannot push");
            return;
        }
		rear = (rear + 1) % SIZE;
		arr[rear] = value;
		count++;
	}
	
	public void pop() 
	{
		if (isFull()) 
		{
            System.out.println("Queue is full cannot pop");
            return;
        }
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
		count--;
	}
	
	public int peek() 
	{
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isEmpty() 
	{
		return count == 0;
	}
	
	public boolean isFull() 
	{
		return count == SIZE;
	}

}




