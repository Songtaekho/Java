package Back;

import java.util.Scanner;

public class Back_2839 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int cnt = 0;

		while (true) {
			if (N % 5 == 0) {
				System.out.println(N / 5);
				break;
			}

			if (N - 3 < 0) {
				System.out.println(-1);
				break;
			}
			N = N - 3;
			cnt++;
			if (N % 5 == 0) {
				cnt += N / 5;
				System.out.println(cnt);
				break;
			}
		}

	}
}
