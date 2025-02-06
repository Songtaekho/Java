package Quiz13;

public class tank extends Unit{
	
	private boolean changeMode = false;
	
	public tank(){
		this.hp = 100;
	}
	@Override
	public void location() {
		System.out.println("현재위치:" + x + ", "  + y);
	}

	@Override
	public void move(int x, int y) {
		System.out.println("위치 이동:" + x + ", " + y);
	}
	public void changeMode() {
		changeMode = !changeMode;
	}
}
