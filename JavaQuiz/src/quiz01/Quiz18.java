package quiz01;

import java.util.Scanner;

public class Quiz18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if(A==0 && B==0) {
				break;
			}
			System.out.println(A+B);
		}
			
			
		
	}
}
