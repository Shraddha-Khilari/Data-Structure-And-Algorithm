package sorting;

import java.util.Stack;

public class expressionEvaluation {
	
	
	public static int calculate(int op1,char opr, int op2)
	{
		switch(opr) {
		case'+': return op1+op2;
		case '-': return op1 - op2;
		case '*': return op1 * op2;
		case '/': return op1 / op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	
	
	
	public static int postfixEvaluate(String postfix) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i<postfix.length(); i++) {
			 char ele = postfix.charAt(i)	;
			 
		if(Character.isDigit(ele)) {
			st.push(ele - '0');
		}
		else {
			int op2 = st.pop();
			int op1 = st.pop();
			int res = calculate(op1,ele,op2);
		st.push(res);			
		}
		}
		return st.pop();
		}

	
	

	public  static int prefixEvaluate(String prefix) {
		Stack<Integer> st = new Stack<Integer>();
		for(int i = prefix.length()-1; i>=0; i--) {
			char ele = prefix.charAt(i);
			if(Character.isDigit(ele)) {
				st.push(ele -'0');
			}
			else {
				int op1 = st.pop();
				int op2 = st.pop();
				int res = calculate(op1,ele,op2);
			st.push(res);
			}
		}
		return st.pop();
	}


	public static void main(String[] args) {
		
	String postfix ="456*3/+9+7-";
	
	System.out.println("Postfix : " + postfix);
	int res = postfixEvaluate(postfix);
	System.out.println("Result : " + res);
	
	

	String prefix = "-++4/*56397";
	System.out.println("Prefix : " + prefix);
	res = prefixEvaluate(prefix);
	System.out.println("Result  : " + res);
	
	}




	
}
