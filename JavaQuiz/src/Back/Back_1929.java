package Back;

import java.util.Scanner;

public class Back_1929 {
	
	//아직 못풀음

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		for(int i = M; i <= N; i++) {
			int cnt = 0;
			
			for(int j = 1; j <= i; j++) {
				if(i % j ==0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				System.out.println(i);
			}
		}
	}
}
