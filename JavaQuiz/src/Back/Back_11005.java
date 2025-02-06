package Back;

import java.util.Scanner;

public class Back_11005 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		int B = scan.nextInt();
		
		int A = Integer.parseInt(N);
		
		System.out.println(Integer.toString(A, B).toUpperCase());
		
	}

}
