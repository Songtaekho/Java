package day01;

public class SystemOut {
	public static void main(String[] args) {
		// main 쓰고 ctrl + space 누르면 자동 생성됩니다.
		/*
		 	실행 단축키 - ctrl + f11
		 	전체선택 - ctrl + a
		 	되돌리기 - ctrl + z
		 	정렬 단축키 - 전체선택 후 ctrl + i
		 	코드를 옮길때 - alt + 방향키
		 */



		//개행을 포함 println() - 맨 마지막에 \n을 자동으로 넣어줍니다.
		// sysout 쓰고 ctrl + spac 누르면 완성
		System.out.println("안녕하세요!?");
		System.out.println("금요일 입니다.");
		System.out.println("집에 가고 싶죠?");


		//개행이 없는 print()
		System.out.print("줄바꿈이 없음 \n");

		//형식지정 출력 printf()

		//서식문자
		/*
		 	\n 줄바꿈
		 	\t tab 버튼만큼 8칸 띄어쓰기
		 	%d 정수를 입력받음
		 	%s 문자열 입력받음
		 	%f 실수값 입력받음
		 */

		System.out.printf("%s가 하고싶은 말을 맨 앞에 적습니다. %d시 %d분전 \n" , "홍길동", 5, 7);
		System.out.printf("%d + %d = %d", 3, 5, 8);
	}

}
