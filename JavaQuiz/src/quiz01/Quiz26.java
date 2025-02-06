package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz26 {
	public static void main(String[] args) {
		
		//백준 111720 - 숫자의합 - 혼자서 못풀었음
		//힌트 - 아스키코드의 차
	
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String b = scan.next();
		
		for(int i = 0; i < b.length(); i++) {//문자열 반복
			 //문자열 한자리씩 갈라줌
			sum += b.charAt(i)-48;
		}
		System.out.println(sum);
	}
}