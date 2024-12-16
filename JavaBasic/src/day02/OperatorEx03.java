package day02;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if 문 소괄호가 true라면, if구문을 실행, false라면 else구문을 실행함
		if(x != 10 && ++y ==21) { //절대 만족할 수 없는 조건일 떄 뒤를 실행하지 않음
			System.out.println("참 입니다.");
		} else { 
			System.out.println("거짓 입니다.");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		//or
		if(x == 10 || ++y ==21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
	}
}