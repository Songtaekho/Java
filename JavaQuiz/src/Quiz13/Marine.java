package Quiz13;

public class Marine extends Unit{

	public static int attack = 6; //모든 개체가 같은 값을 가짐
	public static int armor = 0;
	
	public Marine() {
		this.hp = 60; 
	}

	public void stimpack() {
		attack += 1;
	}
	@Override
	public void location() {
		System.out.println("현재위치:" + x + ", "  + y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("위치 이동:" + x + ", " + y);
	}

}