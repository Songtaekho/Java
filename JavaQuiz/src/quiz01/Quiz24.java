package quiz01;

import java.util.Scanner;

public class Quiz24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		int b = scan.nextInt()-1;
		
		System.out.println(str.charAt(b));
	}
}