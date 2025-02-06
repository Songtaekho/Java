package Quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior w = new Warrior("전붕이");
		
		Warrior w2 = new Warrior("전묵묵");
		Sorceress s = new Sorceress("법뻔뻔");
		
		
		
		w.powerStrike(w2);
		w.powerStrike(s);
		
		w2.info();
		s.info();
		
		Player [] arr = {w2, s}; //플레이어 배열에 전사, 마법사가 들어갈 수 있음
		s.blizard(arr);
		
		w2.info();
		s.info();
		
		
	}
}