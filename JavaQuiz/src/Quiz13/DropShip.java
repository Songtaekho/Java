package Quiz13;

public class DropShip extends Unit{
	
	private Unit[] arr = new Unit[8];
	private int index = 0;
	
	DropShip(){
		this.hp = 60;
	}
	
	public void ride(Unit unit) {
		if( unit instanceof Marine && index < 7) {
			arr[index] = unit;
			index++;
		} else if( unit instanceof tank && index <= 4) {
			arr[index] = unit;
			index += 4;
		} else {
			System.out.println("수송선에 자리가 부족합니다.");
		}
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
