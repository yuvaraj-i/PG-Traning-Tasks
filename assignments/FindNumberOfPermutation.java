package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class FindNumberOfPermutation {
																
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String givenString = input.next();
		
		System.out.println(findPermutation(givenString));
	}

	private static int findPermutation(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> factorialMap = new HashMap<>();
		factorialMap.put(0, 1);
		
		int length = str.length();
		
		for(int i = 0; i < length; i++) {
			char chr = str.charAt(i);
			map.put(chr, map.getOrDefault(chr, 0)+1);	
		}
		
		int numerator = factorialUsingMap(length, factorialMap);
		int denominator = 1;
		
		Iterator<Character> iter = map.keySet().iterator();
	    
	    while (iter.hasNext()) {
	        char key = iter.next();
	        denominator *= factorialUsingMap(map.get(key), factorialMap);
	    }
		
		return numerator / denominator;
		
	}

	private static int factorial(int number) {
		
		int val = 1;
		
		for (int i = 1; i <= number; i++) {
			val *= i;
		}
		
		return val;
	}
	
	private static int factorialUsingMap(int number, HashMap<Integer, Integer> map) {
			
			
			if (map.get(number) != null) {
				return map.get(number);
			}
			
			map.put(number, number * factorialUsingMap(number-1, map));
			
			int answer = map.get(number);
			
//			System.out.println(map);			
			return answer;
		}

}
