package day02;

public class DataType {

		public static void main(String[] args) {
			
			byte a = 127;
			byte a1 = -128;
			
			short b = 32767;
			short b1 = -32768;
		
			int c = 2147483647; // 대략 21억
			int c1 = -2147483648;
			
			long d = 1231354345435345L; // L을 붙임 - int 보다  큰값 저장가능 
			System.out.println(d);
			
			/*
			 * 2진수 , 8진수, 16진수 형태로도 저장이 가능.
			 * 2진수 - 앞에 0b를 붙임
			 * 8진수 - 앞에 0을 붙임
			 * 16진수 - 앞에 0x 를 붙임
			 */
			
			int bin = 0b1010;
			System.out.println("이 진수 bin은 : " + bin + "입니다.");
			
			System.out.println("----------------------------------------------------------");
			//실수형
			float f1 = 3.14F; //뒤에 F를 붙임
			double d1 = 3.14; //기본형
			
			float f2 = 3.14159265358F; // 소수점 7자리 까지만 표현
			double d2 = 3.14159265358; // 소수점 15자리 까지 표현
			
			System.out.println(f2);
			System.out.println(d2);
			
			System.out.println("----------------------------------------------------------");
			
//			boolean bool = 1;
			boolean bool1 = true;
			boolean bool2 = false;
			
			System.out.println(bool1);
			System.out.println(bool2);
			
		}
}
