package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		/*
		 * 1. 첫째줄에 N정수가 주어집니다.
		 * 2. 이후부터는 N줄에 걸쳐서 정수를 입력받습니다.
		 * 이 입력받은 값을, 배열에 순서대로 저장.
		 */
		
		//내가 한거
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int [n]; 
//		int i = 0;
//		while(i < arr.length) {
//			int a = scan.nextInt();
//			arr[i] = a;
//			
//			i++;
//		}
//		System.out.println(Arrays.toString(arr));
//		scan.close();
		
		
		//선생님이 하신거
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int []arr = new int [size];
		
		int i = 0;
		while(i < size) {
			
			int num = scan.nextInt();
			arr[i] = num;
			
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
