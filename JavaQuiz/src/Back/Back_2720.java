package Back;

import java.util.Scanner;

public class Back_2720 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();

		int Quarter = 25;
		int Dime = 10;
		int Nickel = 5;
		int Penny = 1;

		for (int i = 0; i < T; i++) {
			int c = scan.nextInt();
			int[] arr = new int[4];

			int a = 0;

			arr[0] = c / Quarter;
			a = c - arr[0] * Quarter;

			arr[1] = a / Dime;
			a = a - arr[1] * Dime;

			arr[2] = a / Nickel;
			a = a - arr[2] * Nickel;

			arr[3] = a / Penny;

			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

	}
}
