package transaction;

import java.util.Scanner;

public class PayUMoneyServices {

	public static void transaction() {
		System.out.println("Enter the size of transaction array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the values of array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		// ask the user the number of targets to be achieved
		System.out.println("Enter the number of targets: ");
		int noOfTargets = sc.nextInt();
		for (int i = 0; i < noOfTargets; i++) {
			System.out.println("Enter the value of target: ");
			int target = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < size; j++) {
				sum += arr[j];
				if (sum >= target) {
					System.out.println("Target achieved after transaction number: " + (j + 1));
					break;
				}
			}
			if (sum < target) {
				System.out.println("Target cannot be achieved");
			}

		}
		sc.close();

	}
}
