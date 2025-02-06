package Quiz02;

public class Account {

	/*
	  Account클래스
	  
		멤버변수
		이름 - String
		비밀번호 - String
		잔액 - int
		
		생성자
		(이름, 비밀번호, 잔액) 을 받아서 초기화 해주는 생성자 1개
		
		메서드
		입금기능 - deposit(int 입금) : 반환 void - 잔액에 매개변수를 누적하는 기능
		출금기능 - withDraw(int 입금) : 반환 int - 사용자에게 비밀번호를 입력받아서, 비밀번호가 일치하면, 잔액을 차감해하고, 출금값을 반환하는 기능
				*문자열의 비교 "문자열".equals("문자열")
		잔액조회 - getBalance() : 반환 int - 잔액을 반환하는 기능
		
		*/
	
	String name;
	String passWord;
	int money;
	
	Account(String aname, String apassword, int amoney){
		name = aname;
		passWord = apassword;
		money = amoney;
	}
	
	void info() {
		System.out.println("---고객 정보---");
		System.out.println("이름: " + name);
		
	}
	
	int deposit(int a) {
		money += a;
		System.out.println(a+"원 입금 완료");
		return money;
	}
	
	int withDraw(int a, String b) {
		if(passWord.equals(b)) {
			money -= a;
			System.out.println(a+"원 출금 완료");
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		return money;
	}
	
	int getBalance() {
		System.out.println("남은 잔액은: " + money +"원 입니다.");
		return money;
	}
	
}