package day01;

public class SystemOut {

	public static void main(String[] args) {
		//main 쓰고 ctrl + space 누르면 실행함수 자동생성

		//sysout 쓰고 ctrl + space 누르면 출력문 생성


		/* 단축키
		 * 한줄주석 - ctrl + /
		 * 코드이동 - alt + 방향키
		 * shift + 방향키
		 * shift + home
		 * shift + end
		 * 전체선택 - ctrl + a
		 * 정렬 단축키 - 전체선택 후 ctrl + i
		 * 행 복사 - ctrl + alt + 방향키
		 * 
		 * 프로젝트 export 
		 * export: 프로젝트 우클릭한 후, export 누르고 General탭에 Archive File 저장명 입력하고 finish
		 * 프로젝트 import 
		 * import: 이클립스 file -> import 누르고 General탭에 Existing ~~ 누르고 select Archive file -> 압축파일 로드
		 */

		//1. println() - 개행을 마지막에 포함
		System.out.println("곧 쉬는 시간이네");
		System.out.println("아 나는 집에 가야겠다. 나만 간다");

		//2. print() - 개행 미포함
		System.out.print("줄바꿈이 없다\n");
		System.out.print("줄바꿈이 없다\n");

		//3. printf() - 형식 지정 출력문
		/*
		 * 서식문자
		 * \n - 줄바꿈
		 * \t - 탭버튼만큼 8칸 정렬
		 * %d - 정수를 입력받음
		 * %s - 문자열 입력받음
		 * %f - 실수값 입력받음
		 */

		System.out.printf("맨 처음에 하고싶은 말을 적습니다. %s은 %d월 %d일 입니다.","오늘",12,30);
		System.out.printf("\n원주율은 %f입니다.",3.14);
		System.out.printf("\n원주율은 %.2f입니다.",3.14); 
		//%.2f는 소숫점 2자리까지만 표현 %.3f로 하면 3자리까지 표현


		//이 구문에서 숫자를 %d를 이용하여 printf 문장으로 표현해보세요.
		System.out.printf("\n%dx%d=%d %dx%d=%d",2,1,2,2,2,4);
	}
}