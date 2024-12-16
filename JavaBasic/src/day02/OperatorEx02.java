package day02;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//2항 연산자
		int i = 7 / 3;
		int j = 7 % 3;
		int k = 7 * 3;
		
		System.out.println("7 나누기 3의 몫 : " + i);
		System.out.println("7 나누기 3의 나머지 : " + j );
		System.out.println(k);
		
		//비교 연산자
		System.out.println(i == j);		//f
		System.out.println(i != j);		//t
		System.out.println(i >= j);		//t
		System.out.println(i < j);		//f
		System.out.println(k % 2 == 0);	//f
		System.out.println(k % 2 != 0);	//t
		
		System.out.println("--------------------------------------------------");
		
		//비트 연산자 &, | , ^
		int a = 5; //0000 0101 
		int b = 3; //0000 0011
		
		System.out.println(a & b); //0000 0001 -> 두 비트가 1이면 1반환, 다르면 0
		System.out.println(a | b); //0000 0111 -> 두 비트중 하나만 1이어도 1반환, 두 비트 모두0이면 0
		System.out.println(a ^ b); //0000 0110 -> 두 비트가 다르면 1, 같으면 0
		
		//비트 이동 연산자 >> , <<
		int h = 100; //0110 0100
		System.out.println(h >> 2); // 이진수의 자리를 오른쪽으로 2칸 옮긴다.
	}
}