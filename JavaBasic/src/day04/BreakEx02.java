package day04;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//한번만 실행시키고 싶은 코드는 반복문 바깥에 선언
		//정답맞추기
		
		while(true) {
			
			
			System.out.println("3 x 4 = ?");
			System.out.print("정답>");
			int answer = scan.nextInt(); // 입력..
			
			if(answer == 12) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("틀렸는데요?");
			}
			
		}
		
	}
}
