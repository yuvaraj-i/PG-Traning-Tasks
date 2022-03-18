package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapElements {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int totalElements = input.nextInt();
		
		for(int i = 0; i < totalElements; i++) {
			list.add(input.nextInt());
		}
		
		System.out.println(list);
		
//		iterationFullArray(list);
		iterationHalfArray(list);
		
		System.out.println(list);
	}


	private static void iterationHalfArray(ArrayList<Integer> list) {
		
		int length = list.size();
		int firstIndex = 0;
		int lastIndex;
		if (length % 2 == 0) {
			lastIndex = length-1;
		}
		else {
			lastIndex = length-2;
		}
		
		while (firstIndex < lastIndex) {
			if (lastIndex - firstIndex != 1) {
				Collections.swap(list, firstIndex, firstIndex+1);
			}
			
			Collections.swap(list, lastIndex, lastIndex-1);
			
			firstIndex += 2;
			lastIndex -= 2;	
		}
		
	}

	private static void iterationFullArray(ArrayList<Integer> list) {
		int length = list.size();
		
		for(int i = 0; i < length-1; i+=2) {
			int temp = list.get(i);
			list.set(i, list.get(i+1));
			list.set(i+1, temp);
			
		}
	}
	
}
/*
	private static void divideConquer(ArrayList<Integer> list) {
		
		int length = list.size();
		
		if (length == 2 || length == 3) {
			Collections.swap(list, 0, 1);
			return;
		}
		
		int mid = length / 2;
		
		ArrayList<Integer> leftArray = new ArrayList<>(list.subList(0, mid));
		ArrayList<Integer> rightArray = new ArrayList<>(list.subList(mid, length));
		
		divideConquer(leftArray);
		divideConquer(rightArray);
		
//		System.out.println(leftArray);
//		System.out.println(rightArray);
		
		for(int i = 0; i < leftArray.size(); i++) {
			list.set(i, leftArray.get(i));
		}
		
		int j = mid;
		for(int i = 0; i < rightArray.size(); i++) {
			list.set(mid++, rightArray.get(i));
			
		}

	}
}

*/