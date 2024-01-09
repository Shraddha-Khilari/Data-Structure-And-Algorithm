package com.sunbeam;

public class Palindrome 
{
	
	public static boolean checkpalindrome2(String str) {
        if (str.length() <= 1) 
        {
            return true;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        if (first == last)
        {
            return checkpalindrome2(str.substring(1, str.length() - 1));
        }
        else {
            return false;
            //Time Complexity: O(n) 
        }
    }

	    public static boolean checkpalindrome1(String str) 
	    {
	        String reversed = new StringBuilder(str).reverse().toString();
	        return str.equals(reversed);
	        //Time Complexity: O(n^2) 
	    }

	public static void main(String[] args) 
	{
		String input1 = "madam";
		String input2 = "madam";
        String input3 = "notpalindrome";
		if(checkpalindrome1(input1) == true)
	    System.out.println("String is palindrome");
		else
			System.out.println("Not a palindrome");
		
		if(checkpalindrome2(input2) == true)
		    System.out.println("String is palindrome");
			else
				System.out.println("Not a palindrome");
		
		if(checkpalindrome2(input3) == true)
		    System.out.println("String is palindrome");
			else
				System.out.println("Not a palindrome");
        
	}

}
