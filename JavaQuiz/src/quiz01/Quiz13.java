package quiz01;

public class Quiz13 {

	public static void main(String[] args) {
		
		//1. 7~100사이의 정수들 중에서 7의 배수를 *가로로 출력
		int a = 0;
		for(int i = 7; i <= 100; i++) {
			if(i % 7 == 0 ) {
				a = i;
				System.out.print(" "+i+" ");
			}
		}
		//줄바꿈
		System.out.println("\n-----------------------------------------------------------");
		//2. 200까지 정수 중에서 8의 배수의 개수를 출력
		int cnt = 0;
		for(int i = 1; i <= 200; i++) {
			if(i % 8 == 0) {
				cnt++;
			}
		}
		System.out.println("200까지 정수 중에서 8의 배수의 개수:"+cnt);
		//줄바꿈
		System.out.println("\n-----------------------------------------------------------");
		//3. 50~100사이의 짝수의 합을 구하시오.
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			if(i % 2 == 0) {
				sum +=i;
			}
		}
		System.out.println("50~100사이의 짝수의 합:"+sum);
		//줄바꿈
		System.out.println("\n-----------------------------------------------------------");
		//4. A~Z까지 문자열의 합을 구하시오 // 이거 못풀었음
		//A = 65, Z = 90
	
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		System.out.println(str);
	}
}
