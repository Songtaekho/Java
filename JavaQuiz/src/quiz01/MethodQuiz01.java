package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		char[] arr = {'1','2','3','4','5','6'};
		int [] arr2 =  {1,2,3,4,5,6};
		method1();
		System.out.println(method2("안녕~"));
		method3(1,2,3);
		method4(2);
		method5("안녕!", 5);
		System.out.println(maxNum(4,6));
		abs(-100);
		String str = method6(arr); //str 문자열에 메소드값 저장
		System.out.println(str); //str 문자열 출력
		System.out.println(method7(arr2));
		
		String[] arr3 = method8("홍길동", "이순신");
		System.out.println(Arrays.toString(arr3));
	}
	
	//1번 "안녕"출력
	static void  method1() {
		System.out.println("안녕");
	}
	//2번 "전달 받은 매개 변수 리턴"
	static String method2(String s) {
		
		return s;
	}
	//3번 " 세 매개변수 합 리턴"
	static int method3(int a, int b, double c) {
		System.out.println(a+b+c);
		return a+b+(int)c;
	}
	//4번 " 매개 변수가 짝수면 "짝수", 홀수라면 "홀수" 리턴
	static String method4(int a) { // 삼항 연산식으로 쓰면 1줄로 가능
		if(a % 2 == 0) {
			System.out.println("짝수"); //	return "짝수";	
		} else {
			System.out.println("홀수");	// return "홀수";
		}
		return "a";				//
	}
	//5번 "매개 변수 int 만큼 String 반복 출력
	static void method5(String s, int a) {
		for(int i =1; i <= a; i++) {
			System.out.println(s);
		}
		return;
	}
	//6번 " 메게 변수 2개를 입력받아 큰 수 리턴 "
	static int maxNum(int a, int b) {
		
		int max = 0;
		
		if(a > b) {
			max += a;
			return a;	//System.out.println(max);
		} else {
			max += b;
			return b;			//System.out.println(max);
		}
						//return max;
	}
	//7번 " 절대값 리턴 "
	static int abs(int a) {
		System.out.println(a*-1);
		return a*-1;
	}
	//8번 "char배열의 요소를 문자열로 모두 붙여서 리턴" // 힌트 : MethodEx01 문자열을 반환하는 함수 보셈
	static String method6(char[] arr) {
		String str = ""; // String 문자열 생성
		for(int i = 0; i < arr.length; i++) {
			str += arr[i]; // String 문자열에 저장
		}
		return str; //문자열 리턴
	}
	//9번 "배열의 요소의 합을 리턴"
	static int method7(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static String[] method8(String s1, String s2) { // String배열안에 string값 저장후 리턴
		String[] arr = {s1, s2}; // 스트링 배열 새성후 매개변수 저장
		return arr; // 배열 리턴
	}

}