package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		//숙제
		/*
		 * 어떤 수를 입력 받아서, 입력받은 수 까지의 모든 소수들의 합계를 구합니다.
		 * 소수 -약수가 1과 자기자신인 수 (약수의 개수가 2개)
		 * 
		 * 입력 10 -> 출력 2 + 3 + 5 + 7 = 17
		 * 입력 13 -> 출력 2 + 3 + 5 + 7 + 11 + 13 = 41
		 * 
		 */
		
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int sum = 0;
//		
//	
//		for(int i = 1; i <= num; i++) {
//			int count = 0;
//			
//			for(int j = 1; j <= i; j++) {
//				if( i % j == 0) {
//					count++;
//				} 
//			}
//			if(count == 2) {
//				sum += i;
//				System.out.print(i + " + ");
//			}
//			
//		}
//		System.out.println(" = "+sum);
		
		
		
//		int count = 0;
//		for(int i = 1; i<=5; i++) {
//			
//			if(5 % i == 0) {
//				count++;
//			}
//		}
//		
//		if(count == 2) {
//			//5는 소수입니다.
//		}
//		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int num = scan.nextInt();
		
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= num; i++) {
			
			//1의 약수개수, 2의 약수개수, .... num까지 약수의 개수
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				//i는 소수라고 할 수 있음.
				sum += i;
			}
			count = 0;
		}
		
		System.out.println(num + "까지 소수의 합:" + sum);
		
		
		
		
	}
}
	