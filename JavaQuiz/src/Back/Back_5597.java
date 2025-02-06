package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Back_5597 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] arr = new int[30];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < 28; i++) {
			int n = scan.nextInt();
			if(n == arr[n-1]) {
				arr[n-1] = 0;
			} 
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] > 0) {
				System.out.println(arr[i]);
			}
		}
		scan.close();
	}
}
