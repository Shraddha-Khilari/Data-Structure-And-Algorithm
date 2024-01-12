package com.sunbeam;

import java.util.Scanner;

public class Operator 
{
	public static int priority(char opr) 
	{
		switch(opr)
		{
		case '$': return 1;
		case '(':
		case '[':
		case '{':
		case ')':
		case ']':
		case '}':
			return 2;
		case '*':
		case '/':
		case '%':
			return 3;
		case '+':
		case '-':
			return 4;
		}
		return 0;
	}

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Choose any operator to get its priority : ");
		char opr = sc.next().charAt(0);
		int priority = priority(opr);
		System.out.println("Priority of "+ opr +" operator is : "+priority);

	}

}
