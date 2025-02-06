package Quiz02;

public class TvMain {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.power(); // 킴
		tv.changeChannel(5);
		tv.info();
		tv.power(); // 끔
	
	}
}
