package Quiz20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz03 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>();
		
		/*
		 * 회원정보 프로그램 시뮬레이터
		 * 
		 * 무한반복문안에서 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		 * 
		 * 메뉴 1. 유저등록, 2. 현재회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료
		 * 
		 * 1. 스캐너로 name, age입력 받아서 User객체를 리스트에 추가
		 * 2. 모든 회원 정보를 출력하면 됩니다.
		 * 3. 찾을 이름을 입력 받아서 이름이 있으면, 이름과 나이를 출력해 줍니다.
		 * 	  찾는 이름이 없으면 "~~님은 목록에 없습니다."를 출력합니다.
		 * 4. 삭제할 이름을 입력받아서, 동일한 이름을 가진 회원이 있으면 User를 삭제
		 * 5. 종료
		 * 
		 */
		
		
		while(true) {
			System.out.println("메뉴 1. 유저등록, 2. 현재회원정보출력, 3.회원정보검색, 4.회원정보삭제, 5.프로그램종료");
			System.out.println("메뉴>");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.print("이름>");
				String name = scan.next();
				System.out.print("나이>");
				int age = scan.nextInt();
				list.add(new User(name, age));
			}
			
			if(menu == 2) {
				
				System.out.println("============전체 회원 정보 출력============");
				
				for(int i = 0; i < list.size(); i++) {
					User user = list.get(i);
					System.out.println(user.getName() + " " + user.getAge());
				}
			}
			
			if(menu == 3) {
				System.out.print("이름>");
				String search = scan.next();
				boolean find = true;
			
				for(int i = 0; i < list.size(); i++) {
					User user = list.get(i);
					if(user.getName().equals(search)) {
						find = false;
						System.out.println(user.getName()+ " " + user.getAge());
						break;
					}
				}
				if(find) {
					System.out.println(search + "님은 목록에 없습니다.");
				}
			}
			
			if(menu == 4) {
				System.out.print("이름>");
				String del = scan.next();
				boolean find = true;
				
				for(int i = 0; i < list.size(); i++) {
					User user = list.get(i);
					if(user.getName().equals(del)) {
						find = true;
						list.remove(i);
						System.out.println(del + "님의 정보를 삭제합니다.");
						break;
					}
				}
				if(find) {
					System.out.println(del + "님은 목록에 없습니다.");
				}
			} 
			
			if(menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
