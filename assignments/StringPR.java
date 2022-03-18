package assignments;
import java.util.Scanner;

public class StringPR {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String given = input.next();
		
		if (checkAlternate(given)) {
			System.out.println("Perfect");	
		}
		else {
			System.out.println("Imperfect");
		}

	}

	private static boolean checkAlternate(String given) {
	
		for(int i = 0; i < given.length()-1; i++) {
			if (given.charAt(i) == 'P' && given.charAt(i+1) == 'R') {
				continue;
			}
			else if (given.charAt(i) == 'R' && given.charAt(i+1) == 'P') {
				continue;
			}
			else {
				return false;
			}
				
		}
		return true;
	}
 
	private static boolean checkAlternateHalf(String given) {
		int low = 0;
		int high = given.length()-1;
		
		
		while (low < high) {
			if(checkCharacters(given.charAt(low), given.charAt(low+1))) {
				return false;
			}
			else if(checkCharacters(given.charAt(high), given.charAt(high-1))) {
				return false;
			}
			
			low += 1;
			high -= 1;
		}

		return true;
		
	}

	private static boolean checkCharacters(char chr1, char chr2) {
	
		if (chr1 == 'P' && chr2 == 'R') {
			return false;
		}
		else if (chr1 == 'R' && chr2 == 'P') {
			return false;
		}
				
		return true;

	}
}
