package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//1. 1~입력받은수 까지의 6의 배수의 합 // 제어변수 -> 조건 -> 제어변수
		int num = scan.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= num ) {
			if(i % 6 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1~입력받은수 까지의 6의 배수의 합: "+ sum);
		
		//2. 1~100까지 정수 중에서 4의 배수이면서 8의 배수가 아닌 수의 개수
		int j = 1;
		int cnt = 0;
		while(j <= 100) {
			if(j % 4 == 0  && j % 8 !=0 ) {
				cnt++;
			}
			j++;
		}
		System.out.println("1~100까지 정수 중에서 4의 배수이면서 8의 배수가 아닌 수의 개수: "+cnt);
		
		//3. 50~100까지 정수들의 합
		int k = 50;
		int sum2 = 0;
		while(k <= 100) {
			sum2 +=k;
			k++;
		}
		System.out.println("50~100까지 정수들의 합 "+sum2);
		//4. 1000의 약수들의 개수
		
		int l = 1;
		int cnt2 = 0;;
		while(l <= 1000) {
			if(1000 % l == 0) {
				cnt2++;
			}
			l++;
		}
		System.out.println("1000의 약수들의 개수"+cnt2);
		scan.close();
	}
}
