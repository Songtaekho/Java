package Back;

import java.util.Scanner;

public class Back_2292 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cnt = 0; //거리
		int  N = scan.nextInt();
		
		for(int i = 1; i <= N+i; i += 6 * cnt) {
			cnt++;
			if(i >= N) {
				System.out.println(cnt);
				break;
			}
		}
	}
}