package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz25 {

	public static void main(String[] args) {
		
		//백준 9086
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] arr = new String [num];
		
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = scan.next();
			char c = arr[i].charAt(0);
			char d = arr[i].charAt(arr[i].length()-1);
			System.out.println(c + "" + d);
		}
		scan.close();
	}
}
