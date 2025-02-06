package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Back_2941 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		String[] arr = str.split("");
		
		int cnt = 0;
		
		for(int j = 0; j < arr.length-2; j++) {
			if((arr[j] + arr[j+1] + arr[j+2]).equals("dz=")) {
				System.out.println();
				cnt++;
			} else {
				for(int i = 0; i < arr.length-1; i++) {
					if((arr[i] + arr[i+1]).equals("z=")) {
						cnt++;
					}	
				}
			}
		}	
		
		
		System.out.println(cnt);
		System.out.println(arr.length-cnt);
	}
}

