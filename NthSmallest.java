package finalTakeHome;

import java.util.Scanner;
import java.util.Arrays;

public class NthSmallest {
	public static void main(String[] args) {
		int[] numbers = new int[500];

		Scanner sc = new Scanner(System.in);

		// Generate 500 random numbers
		for (int i = 0; i < 500; i++) {
			numbers[i] = (int) (Math.random() * 1000);
		}

		System.out.print("Enter the Nth smallest number you want to find: ");
		int n = sc.nextInt();

		// Sort the numbers
		Arrays.sort(numbers);

		// Print the Nth smallest number
		System.out.println("The " + n + "th smallest number is: " + numbers[n - 1]);
	}
}
