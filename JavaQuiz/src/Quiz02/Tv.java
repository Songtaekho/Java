package Quiz02;

public class Tv {
	  /*
		멤버변수
		회사명 - String
		채널번호 - int
		전원 - boolean
		
		생성자
		기본 생성자는 회사명을 초기화 LG
		
		메서드
		정보출력 - info() : 반환 void - 티비의 정보를 출력
		채널변경 - changeChannel(int) : 반환 int - 현재 채널을, 전달받은 값으로 변경하는 기능
		전원켜기 - power() : 반환 void - 전원을 껐다 켰다 하는기능
		
		*/
		String company;
		int Channel;
		boolean power;
		
		Tv() {
			company = "LG";
			
		}
		
		void info() {
			System.out.println("---Tv 정보---");
			System.out.println("회사명: " + company);
			System.out.println("채널번호: " + changeChannel(5));
			System.out.println("전원: " + power);
		}
		
		int changeChannel(int ch) {
			Channel = ch;
			System.out.println("현재채널:" + Channel);
			return  Channel;
		}
		
		void power() {
			power = !power;
			
			if(power)  {
					System.out.println("전원이 켜졋습니다");
			} else {
				System.out.println("전원이 꺼졌습니다");
			}
		}
	
}
