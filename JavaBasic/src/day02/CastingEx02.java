package day02;

public class CastingEx02 {

	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환 할때는 type casting
		 * 을 사용해서 명시적으로 형변환을 해야합니다.
		 */
		
		int i = 70; //4byte
		char c = (char)i; //casting
		short s = (short)i;
		
		System.out.println(c);
		
		float f1 = 3.14F;
		int j = (int)f1;
		
		System.out.println(j);
		
		
	
		/*
		 * 명시적 변환시에 주의할 점
		 * 해당 값을 저장할 수 없는 범위가 들어오면, 잘려나간 값(쓰레기값)이
		 * 저장 됩니다.
		 */
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b);
		
	}
}
