package assignments;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class AnagramHashmap {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str1 = input.nextLine();
		String str2 = input.nextLine();
		
		System.out.println(checkAnagram(str1, str2));
	}
	private static boolean checkAnagram(String str1, String str2) {
	    
	    if (str1.length() != str2.length()) {
	        return false;
	    }
	    
	    HashMap<Character, Integer> map = new HashMap<>();
	    
	    for (int i = 0; i < str1.length(); i++) {
	        
	        char chr1 = str1.charAt(i);
	        if (map.containsKey(chr1)) {
	            int cur = map.get(chr1) + 1;
	            map.put(chr1, cur);
	        }
	        else {
	            map.put(chr1, 1);
	        }
	        
	        char chr2 = str2.charAt(i);
	        
	        if (map.containsKey(chr2)) {
	            int cur = map.get(chr2) - 1;
	            map.put(chr2, cur);
	        }
	        else {
	            map.put(chr2, -1);
	        }
	       
	    }
	    
	    Iterator<Character> iter = map.keySet().iterator();
	    
	    while (iter.hasNext()) {
	        Character key = iter.next();
	        if (map.get(key) != 0){
	            return false;
	        }
	    }

	    return true;
	    
	
	}
}
