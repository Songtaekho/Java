package day02;

public class CastingEx01 {

		public static void main(String[] args) {
			
			
			/*
			 * 크기가 작은타입을 큰 타입에 대입하면
			 * 자동으로 형변환을 해줍니다.
			 * JVM(자바가상머신)이 해줌
			 */
			
			byte b = 10;
			short c = b; // byte -> short 형으로 자동형변환
			int i = b; // byte -> int 형으로 자동형변환
			long l = b;
			
			char cc = 'A';
			int ii = cc; // char - > int 형으로 자동형변환
			
			System.out.println(ii);
			
			int k = 10;
			double d = k;
			System.out.println(d); // int -> double 형으로 자동형변환
			
		}
}
