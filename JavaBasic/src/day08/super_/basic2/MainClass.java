package day08.super_.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20 , "123456");
		
		System.out.println(s.info());
		
		//teacher, Employee도 생성자 만들고, 객체 생성 해주셈
		
		Teacher t = new Teacher("김이박", 24, "수학");
		
		System.out.println(t.info());
		
		Employee e = new Employee("박춘배", 42, "인사과");
		
		System.out.println(e.info());
		

		
	}
	
}