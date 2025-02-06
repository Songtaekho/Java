package Quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapQuiz02 {

	public static void main(String[] args) {
		/*
		 * 메뉴관리 시뮬레이터
		 * 
		 * 무한 반복문안에서 음식 메뉴를 입력받고, 해당 메뉴에 알맞은 내용을 채워 넣어주면 됩니다.
		 * 
		 * 음식메뉴는 key로 등록하고 가격은 value로 등록합니다. 음식 메뉴 정보 1. 신규 메뉴 등록 2. 메뉴판 전체 보기 3. 메뉴판 수정
		 * 4. 메뉴판 삭제 5. 프로그램 종료
		 * 
		 * 1. 이미 등록된 메뉴인지 확인 후에 메뉴 등록 2. 메뉴와 가격을 전부 출력 3. 변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정 4.
		 * 변경할 메뉴를 받아서 메뉴가 있다면 삭제 5. 프로그램 종료
		 */
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> food = new HashMap<>();

		while (true) {
			System.out.println("음식 메뉴 정보");
			System.out.println("1. 신규 메뉴 등록 2. 메뉴판 전체보기 3. 메뉴판 수정 4. 메뉴판 삭제 5. 프로그램 종료");
			int menu = scan.nextInt();

			if (menu == 1) {
				System.out.print("음식이름>");
				String name = scan.next();
				if (!food.containsKey(name)) {
					System.out.print("가격>");
					int price = scan.nextInt();
					food.put(name, price);
					System.out.println("메뉴 등록 완료!");
					System.out.println();
				} else if (food.containsKey(name)) {
					System.out.println("이미 등록된 메뉴 입니다.");
					System.out.println();
				}
			}
			
			if (menu == 2) {
				System.out.println("메뉴판>");
				Set<Entry<String, Integer>> entrySet = food.entrySet();
				for (Entry<String, Integer> entry : entrySet) {
					System.out.println(entry.getKey() + ", " + entry.getValue());
				}
			}
			
			if (menu == 3) {
				System.out.println("가격수정");
				System.out.print("수정할 메뉴>");
				String remake = scan.next();
				if (food.containsKey(remake)) {
					Integer value = food.get(remake);
					System.out.print("수정할 가격>");
					value = scan.nextInt();
					food.put(remake, value);
				} else if (!food.containsKey(remake)) {
					System.out.println("등록되지 않은 메뉴 입니다.");
				}
			}
			
			if (menu == 4) {
				System.out.println("메뉴삭제");
				System.out.print("삭제할 메뉴>");
				String del = scan.next();
				if (food.containsKey(del)) {
					food.remove(del);
				}else if (!food.containsKey(del)) {
					System.out.println("등록되지 않은 메뉴 입니다.");
				}
			}
			
			if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
