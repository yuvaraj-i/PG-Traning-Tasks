package assignments;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParenthesis {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String brackets = input.nextLine();
		
		System.out.println(balanceBrackets(brackets));

	}

	private static String balanceBrackets(String brackets) {

		Stack<Character> openBrackets = new Stack<>();
		String temp = "";

		for (int i = 0; i < brackets.length(); i++) {
			char curChar = brackets.charAt(i);
			
			if (curChar == '(' || curChar == '[' || curChar == '{') {
				temp += curChar;
				openBrackets.push(curChar);
			} 	
			else {
				
				if (!openBrackets.isEmpty()) {
					char value = openBrackets.pop();
					
					if (curChar == ']' && value == '[') {
						temp += curChar;
					}
					else if (curChar == '}' && value == '{') {
						temp += curChar;
					}
					else if (curChar == ')' && value == '(') {
						temp += curChar;
					}
					else if (curChar == ']' && value != '[') {
						openBrackets.push(value);
						temp += "[]";
					}
					else if (curChar == '}' && value != '{') {
						openBrackets.push(value);
						temp += "{}";
					}
					else if (curChar == ')' && value != '(') {
						openBrackets.push(value);
						temp += "()";
					}
				}
				else {
					if (curChar == ']') {
						temp += "[]";
					}
					else if (curChar == '}') {
						temp += "{}";
					}
					else if (curChar == ')') {
						temp += "()";
					}
				}
				
			
			}
			
		}
		
		while(!openBrackets.isEmpty()) {
			char value = openBrackets.pop();	
			
			if (value == '(') {
				temp += ")";
			}
			else if (value == '[') {
				temp += "]";
			}
			else {
				temp += "}";
			}
			
		}
		
		return temp;
	}

}
