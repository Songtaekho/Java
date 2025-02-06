package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Back_10811 {

	public static void main(String[] args) {
		
		//백준 10811 바구니 바꾸기 - 아직 못품 - 이젠 풀었음
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int [] arr = new int[N];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}

		for(int a = 0; a < M; a++) {
			int i = scan.nextInt() -1; // 1
			int j = scan.nextInt() -1; // 4
			
			for(int b = i; b <= j; b++, j--) { // i 부터 j 까지 역순으로 교환
			int temp = arr[b]; // (예시) 1~4번 까지 역순이면 i(1)랑 j(4)랑교환 i(1)+1이랑 j(4)-1이랑 교환
			arr[b] = arr[j];
			arr[j] = temp;
			}
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
			scan.close();
	}
	
}
