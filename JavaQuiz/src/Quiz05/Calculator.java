package Quiz05;

//부모 클래스
public class Calculator {

/* 2번 과제
 * Calculator를 부모클래스로 선언하세요.
 * Calculator를 상속받는 Computer클래스 생성 합니다.
 * 
 * Calculator의 멤버변수 int result, double pi를 선언하세요
 * Calculator의 메서드
 * add(int) : result에 값을 누적시키는 기능
 * sub(int) : result에 값을 차감시키는 기능
 * circle(int) - pi를 이용해서 원의 넓이를 리턴하는 기능  (원의넓이: PI * r * r)
*/
	
	int result;
	double pi = 3.14;
	
	int add(int a) {
		result += a;
		return result;
	}
	
	int sub(int a) {
		result -= a;
		return result;
	}
	
	
	double circle(int a) {
		return pi * a * a;
	}
}
