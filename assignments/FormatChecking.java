package assignments;
import java.util.HashMap;
import java.util.Scanner;

public class FormatChecking {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		HashMap<String, Integer> datesCount = new HashMap<>();
		String[] inputStrings = input.nextLine().split(" ");
		
			
		for(int i = 0; i < inputStrings.length; i++) {
			String temp = inputStrings[i];
			
			if(containsFormat(temp)) {
				
				String[] format = temp.substring(0, 10).split("-");
				
				if (format[0].length() == 2 && format[1].length() == 2 && format[2].length() == 4) {
					datesCount.put(format[2], datesCount.getOrDefault(format[2], 0)+1);
				}
				
			}
			
		}
		
		System.out.println(datesCount.size());
		
	}

	private static boolean containsFormat(String str) {
		
		if (!str.contains("-"))
			return false;
		
		String[] numeric = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		
		for(int i = 0; i < numeric.length; i++) {
			if (str.contains(numeric[i])) {
				if (str.length() >= 10) {
					return true;
				}
			}
		}
		
		return false;
	}

}
