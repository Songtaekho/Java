package Quiz20;

public class User {
	private String name;
	private int age;
	
//	1. User클래스는 은닉된 변수로 name, age를 선언.
//	 *    User클래스의 생성자도 선언.
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public int getAge() {
		return age;
	}
	
}
