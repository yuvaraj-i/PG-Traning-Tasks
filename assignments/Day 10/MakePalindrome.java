package assignments;

import java.util.Scanner;

public class MakePalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String givenString = input.next();

		if (checkPalindrome(givenString)) {
			System.out.println("Palindrome String");
		} 
		else {
			String answer = makeStringPalindrome(givenString);
			System.out.println(answer);
		}

	}

	private static boolean checkPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) == str.charAt(right)) {
				left += 1;
				right -= 1;
			} 
			else {
				return false;
			}
		}

		return true;

	}

	private static String makeStringPalindrome(String str) {
		int val = str.length() - 1;

		while (str.charAt(val) == str.charAt(val - 1)) {
			val -= 1;
		}

		String temp = "";

		for (int i = val - 1; i >= 0; i--) {
			str += str.charAt(i);
		}

		return str + temp;

	}

}
