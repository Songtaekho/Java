package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		/*
		 * 랜덤한 1~100까지 수를 생성하고, 정답 맞추기 프로그램
		 * 
		 * 1. 0을 입력하면 종료가 됩니다
		 * 2. 종료될떄는 정답, 오답 개수를 출력해 주세요
		 */
		
		Scanner scan = new Scanner(System.in);
		int cnt1 = 0;
		int cnt2 = 0;
		
		while(true) {
			int a = (int)((Math.random()*100)+1);
			int b = (int)((Math.random()*100)+1);
			System.out.println(a + " + " + b + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				System.out.println("프로그램 정상 종료");
				System.out.println("정답:" + cnt1);
				System.out.println("오답:" + cnt2);
				break;
			}else if(answer == a+b) {
				cnt1 ++;
				System.out.println("정답입니다\n------------------------");
			} else if (answer != a+b) {
				cnt2 ++;
				System.out.println("틀렸는데요?\n------------------------");
			} 
		}
	}
}
