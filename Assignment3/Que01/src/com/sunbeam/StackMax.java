package com.sunbeam;

import java.util.Stack;

public class StackMax 
{
	private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public StackMax() 
    {
    	mainStack = new Stack<>();
    	maxStack = new Stack<>();
    }

    public void push(int value) 
    {
        mainStack.push(value);

        if (maxStack.isEmpty() || value >= maxStack.peek()) 
        {
            maxStack.push(value);
        }
    }

    public int pop() 
    {
        if (mainStack.isEmpty()) 
        {
            throw new IllegalStateException("Stack is empty");
        }

        int poppedValue = mainStack.pop();

        if (poppedValue == maxStack.peek()) 
        {
            maxStack.pop();
        }

        return poppedValue;
    }

    public int getMax() 
    {
        if (maxStack.isEmpty()) 
        {
            throw new IllegalStateException("Stack is empty");
        }

        return maxStack.peek();
    }

	
	public static void main(String[] args) 
	{
		StackMax stack = new StackMax();

        stack.push(14);
        stack.push(26);
        stack.push(88);
        stack.push(12);
        stack.push(65);

        System.out.println("Maximum value in the stack: " + stack.getMax());
	}

}






























