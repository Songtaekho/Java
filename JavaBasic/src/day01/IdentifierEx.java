package day01;

public class IdentifierEx { // 클래스는 앞글자 대문자
	
	public static void main(String[] args) {
		
		int age = 10;
		int Age = 20; //대소문자 구분함
		
		System.out.println(age);
		System.out.println(Age);
		
		int phonenumber = 3; // X
		int phoneNumber = 4; // O - 카멜표기법
//		int phone number = 5; //공백은 사용 X 굳이 공백을 쓸거라면 _를 사용
		
//		int class = 10; // 키워드는 이름을 지을 수 없음
//		int public = 20;
	}

}
