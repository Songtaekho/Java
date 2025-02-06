package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arr[][] = new int [9][9];
		int max = 0 ;
		int a = 0, b = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scan.nextInt();
				if(max < arr[i][j]) {
					max = arr[i][j];
					a = i;
					b = j;
				}
			
			}
			
		}
		System.out.println(max+"\n"+ (a+1) + " " + (b+1));
	
		
		scan.close();
	}
}
