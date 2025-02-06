package Quiz20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetQuiz02 {

	public static void main(String[] args) {

		/*
		 * 로또기기 당첨 시뮬레이터!
		 * 
		 * {5, 23, 35, 7, 41, 13} 이 번호가 당첨 번호입니다. 랜덤한 로또번호 6개를 생성해서, 당첨 번호와 일치하는지 확인합니다.
		 * 몇 번의 시도 끝에 당첨되는지 계산하고, 소요된 비용을 출력하세요. 로또 1회 구매 비용은 1,000원입니다.
		 * 
		 * 힌트) set이 요소가 동일한지 확인하는 메서드는 set.equals(set) 입니다
		 */
		Set<Integer> set = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		
		set2.add(5);
		set2.add(23);
		set2.add(35);
		set2.add(7);
		set2.add(41);
		set2.add(13);

		int cnt = 0;
		long money = 0;

		while (true) {

			set.add(((int) (Math.random() * 45) + 1));

			if (set.size() == 6) {
				cnt++;
				money += 1000;

			}
			if (set.equals(set2)) {
				System.out.println("당신의 로또 번호 :" + set.toString());
				System.out.println(cnt + "회 로또를 구매하였고 " + money + "원이 들었습니다");
				break;
			}
			if (set.size() == 6) {
				set.clear();
			}
		}
	}
}
