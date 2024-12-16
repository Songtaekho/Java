package day02;

public class OperatorEx01 {

	public static void main(String[] args) {
		
		//단항 연산자
		//부호연산자 -, +
		int i = -3;
		int j = +3;
		int k = -i;
		
		
		
		//증감연산자 
		int x = 1;
		int y = x++; // 후위연산자 - 먼저값을 대입하고, 맨 마지막에 자신을 증가
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
		
		int n = 1;
		int m = ++n; // 전위연산자 - 먼저 자신을 증가 후 대입
		System.out.println("n값 :" + n);
		System.out.println("m값 :" + m);
		
		//일반적인 사용
		
		x = 1;
		x++;
		++x;
		System.out.println(x); // 3
		
		System.out.println("---------------------------------------------------------");
		
		//비트 연산자 ~ (알아두기만해) 비트값을 반대로 바꿈
		byte b =10; // 0000 1010
		System.out.println(~b); // 1111 0101 / -11
		System.out.println(~b + 1); // 10
		
		System.out.println("---------------------------------------------------------");
		
		//논리 반전 연산자 !
		boolean bool = !true;
		System.out.println(bool);
		System.out.println(!false);
		
	}
}
