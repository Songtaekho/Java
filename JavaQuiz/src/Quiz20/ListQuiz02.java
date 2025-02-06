package Quiz20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. User클래스는 은닉된 변수로 name, age를 선언.
		 *    User클래스의 생성자도 선언.
		 * 
		 * 2. User클래스를 저장할 수 있는 ArrayList선언
		 * 3. User객체를 2개 생성해서 리스트에 추가하세요.  
		 */
		
		List<User> list = new ArrayList<>();
		User user1 = new User("홍길자", 23);
		User user2 = new User("홍길동", 24);
		
		list.add(user1);
		list.add(user2);
		
		//* 4. list에 저장된 모든 이름,나이를 for문으로 출력, 향상된 for문으로 출력
		
		for(int i = 0; i < list.size(); i++) {
			User user = list.get(i);
			System.out.println(user.getName() + " " + user.getAge());
		}
		System.out.println("-----------------------------------------------------");
		
		for(User u : list) {
			System.out.println(u.getName() + " " + u.getAge());
		
		}
		System.out.println("-----------------------------------------------------");
		//* 5. list에 "홍길자" 가 있다면 홍길자의 이름, 나이만 출력
		
		for(int i = 0; i < list.size(); i++) {
			User user = list.get(i);
			if(user.getName().equals("홍길자")) {
			System.out.println(user.getAge() + " " + user.getName());
			}
		}
		System.out.println("-----------------------------------------------------");
		//* 6. list에 "홍길동" 이 있다면 객체를 삭제. 
		for(int i = 0 ; i < list.size(); i++) {
			User user = list.get(i);
			System.out.println(user.getAge()+ " " + user.getName());
			if(user.getName().equals("홍길동")) {
				list.remove(i);
			}
		}
		System.out.println("-----------------------------------------------------");
		
		for(User u : list) {
			System.out.println(u.getName() + " " + u.getAge());
		}
		System.out.println("-----------------------------------------------------");
	}
}
