package Back;

import java.util.Scanner;

public class Back_2869 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int climb = scan.nextInt();
		int sleep = scan.nextInt();
		int finish = scan.nextInt();
		int cnt = 1;
		
		if((finish - climb) % (climb-sleep) == 0) {
			cnt += (finish - climb) / (climb-sleep);
		} else {
			cnt += ((finish - climb) / (climb-sleep))+1;
		}
		
		
		System.out.println(cnt);

	}
}
