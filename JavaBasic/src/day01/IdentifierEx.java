package day01;

public class IdentifierEx {
	
	public static void main(String[] args) {
		
		//식별자 - 이름 규칙
		//1. 대소문자를 구분함
		//변수의 이름의 규칙은 소문자로 만듭니다.
		int age = 27;
		int Age = 40;
		
		System.out.println(age);
		System.out.println(Age);
		
//		int 4num = 1; // ctrl + / 빠른주석 - 숫자로 시작할 수 없음
		
		//변수의 붙어있는 단어 첫글자는 대문자로 짓습니다.
		int phonenumber = 4; // No
		int phoneNumber = 10; // Ok
		
		//키워드는 사용할 수 없음
		
//		int int = 1;
//		int class = 1;
		
	}
}
