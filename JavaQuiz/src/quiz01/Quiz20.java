package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr = new int [N];
		
		
		
		
		
		 // 반복문 2번씀
//		for(int i = 0; i < arr.length ; i++) {
//			int A = scan.nextInt();
//			arr[i] = A;
//		}
//		int max = arr[0];
//		int min = arr[0];
//		for(int i = 0; i < arr.length ; i++) {
//			
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			
//			if(min > arr[i]){
//				min = arr[i];
//			}
//		}
//		System.out.println(min + " " + max);
		
		
		// 반복문 1번쓰고 조건문으로 해결
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			
			if(i == 0) {
				max = arr[i];
				min = arr[i];
			}
			
			if(arr[i] > max) { // 최대값
				max = arr[i];
			}
			
			if(arr[i] < min) { // 최소값
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}