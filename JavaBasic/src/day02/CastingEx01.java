package day02;

public class CastingEx01 {

	public static void main(String[] args) {

		/*
		 * 크기가 작은 타입을 큰 타입에 넣을 때는
		 * 자바 가상 머신 JVM이 자동으로 형변환을 해줍니다.
		 */
		
		byte a = 10;
		short s = a; // byte -> short 자동형변환
		int i = a; 	 // byte -> int 자동형변환
		long l = a;  // byte -> long 자동형변환
		
		char c = '가'; // 2byte
		int j = c;
		
		System.out.println(c);
		System.out.println("가의 유니코드 값 : "+j);
		
		int k = 1000;
		double d = k; //int -> double 자동형변환
		
		System.out.println(d);
	}
}
