package Quiz18;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * 
		 * 띄어쓰기 기준으로 데이터 입력이 들어올 때,
		 * 정수 배열에 저장하기
		 * 
		 * 54 32 43 52 75
		 * 
		 * nextLine()받아서, split() 쪼개고, parseInt로 변환해서
		 * 정수 배열에 저장
		 */
		Scanner scan = new Scanner(System.in);
		
		String[] str = scan.nextLine().split(" ");
		

		
		int[] arr2 = new int[str.length];
	
		for(int i = 0; i < str.length; i++) {
			arr2[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr2));
	}
}
