package assignments;

import java.util.HashSet;
import java.util.Scanner;

public class CountProducts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = input.nextInt();
		}

		int k = input.nextInt();

		int count = 0;

		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				if (arr[i] * arr[j] == k) {
					count += 1;
				}
			}
		}
		System.out.println(count);

		System.out.println(productPairsUsingSet(arr, k));

	}

	private static int productPairsUsingSet(int[] arr, int product) {
		HashSet<Integer> uniqueNums = new HashSet<>();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (uniqueNums.contains(product / arr[i])) {
				count += 1;
			} 
			else {
				uniqueNums.add(arr[i]);
			}
		}

		return count;
	}

}
