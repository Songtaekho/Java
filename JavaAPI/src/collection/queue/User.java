package collection.queue;

public class User implements Comparable<User>{
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

	@Override
	public int compareTo(User o) {
		
//		String name = o.getName();
//		return this.name.compareTo(name);
//		return name.compareTo(this.name);
		
		int age = o.getAge();
		//return Integer.compare(this.age, age); // 나이 기준으로 오름차순
		return Integer.compare(age, this.age);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
