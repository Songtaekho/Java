package Quiz10;

public class Computer {
	
	private KeyBoard keyboard;
	private Mouse mouse;
	private Monitor monitor;
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() {
		this.keyboard = new KeyBoard();
		this.mouse = new Mouse();
		this.monitor = new Monitor();
	}
	
	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard keyboard, Mouse mouse, Monitor monitor ){
		this.keyboard = keyboard;
		this.mouse = mouse;
		this.monitor = monitor;
	}
	
	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void CoumputerInfo() {
		keyboard.info();
		mouse.info();
		monitor.info();
	}
	
	public void setKeyBoard(KeyBoard keyboard) {
		this.keyboard = keyboard;
	}
	
	public KeyBoard getKeyBoard() {
		return keyboard;
	}
	
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	public Mouse getMouse() {
		return mouse;
	}
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	public Monitor getMonitor() {
		return monitor;
	}
	


	

	
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
		
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
