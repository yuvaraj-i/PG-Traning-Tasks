package assignments;

import java.util.Scanner;

public class Anagram
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	    String str1 = input.nextLine();
	    String str2 = input.nextLine();
	    
	    System.out.print(checkAnagram(str1, str2));
	    
	}
	
	public static boolean checkAnagram(String str1, String str2) {
	    
	    if (str1.length() != str2.length()) {
	       return false;
	   }
	        
	   int[] map = new int[256];
	        
	   for (int i = 0; i < str1.length(); i++) {    
	       int ch = str1.charAt(i);   
	       map[ch] += 1;
	   }
	        
	   for (int j = 0; j < str2.length(); j++) {      
	       map[str2.charAt(j)] -= 1;
	   }
	        
	   for (int k = 0; k < 256; k++) { 
	       if (map[k] != 0) {
	           return false;
	       }
	            
	   }
	        
	   return true;
	        
	}
}


