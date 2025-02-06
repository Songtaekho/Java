package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		/*
		 * 가로, 세로 길이를 입력 받습니다.
		 * 가로, 세로 길이의 사각형을 출력하면 됩니다.
		 * 단, 윤곽만 나타나도록 출력
		 * 힌트 -> 첫행과, 마지막행, 첫열과, 마지막열에서 *출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int x = scan.nextInt();
		System.out.print("세로>");
		int y = scan.nextInt();
		
		//내가한거
//		for(int i = 1; i <= y; i++) {
//			if(i == 1 | i == y) {
//				for(int j = 1; j <= x; j++) {
//					System.out.print("*");
//				}
//			} else {
//				for(int j = 1; j <= 2; j++) {
//					System.out.print("*");
//					for(int k = 1; k <= x-2; k++) {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
		
		//선생님이 한거
		for(int i = 1; i <= y; i++) {
			
			for(int j = 1; j <= x; j++) {
				if(i == 1 || i == y) { // 첫행, 마지막행
					System.out.print("*");
				} else { // 첫행과 마지막행이 아닐 때
					if (j == 1 || j == x) {  //첫열, 마지막열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		}
	}

