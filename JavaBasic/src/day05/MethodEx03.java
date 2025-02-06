package day05;

public class MethodEx03 {

	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 매서드가 실행결과를 돌려주는 값에 대한 type 입니다.
		 * 2. 반환유형이 있으면 return뒤에 값을 담아주고,
		 *	  반환유형이 없으면 반환유형자리에 void라고 적으면 됩니다.
		 * 3. 리턴이 있는 함수들은 호출구문이 값이 되기 때문에, 출력구문이나 다른함수의
		 * 	  매개변수로 쓸 수 있습니다.
		 */

		int result = add(1, add(1, 1)); //호출구문 자체가 값이 됨
		System.out.println("결과:"+result);
		
		//System.out.println( sub(1, 2));
		sub(1, 2); //void형 함수는 호출만 가능함. (함수가 실행되고 끝)
		
		//void형 매서드에서 return키워드를 쓸 수 없는가? 쓸 수 있음.
		noReturn("hello");
		noReturn("bye");
	}
	
	// a + b를 리턴하는 함수
	static int add(int a, int b) {

	
		
		return a + b;
	}

	static void sub(int a, int b) {
		
		System.out.println(a+ " - " +b + " = " + (a-b));
	}

	//bye 매개변수가 들어오면, 함수를 더이상 실행시킬 필요가 없는 매서드
	static void noReturn(String s) {
		
		if(s.equals("bye")) {
			System.out.println("bye!");
			return;
		}	
		System.out.println("매개변수는: " + s + "입니다.");
	}

}