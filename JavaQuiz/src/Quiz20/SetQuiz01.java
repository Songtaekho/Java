package Quiz20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 로또 번호 자동 생성기
		 * Set을 이용해서 6개의 랜덤한 로또 번호를 만들어내는 프로그램 코드를 작성해보세요.
		 * 
		 * 1~45번 
		 * 
		 */
		
		Set<Integer>set = new HashSet<>();
		
		while(true) {
	
			set.add(((int)(Math.random()*45) +1));
		
			if(set.size() == 6) {
				break;
			}
		}

		Iterator<Integer> iter = set.iterator();
		
		for (int a : set) {
			System.out.print(a + " ");
		}
		
		
	}
}
