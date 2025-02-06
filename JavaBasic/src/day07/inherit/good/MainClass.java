package day07.inherit.good;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person(); // 공통 기능만 가지고있는 클래스여서 자주 안씀 하지만 객체로 사용가능
		p.name = "홍길동";
		p.age = 20;
		System.out.println(p.info());
		
		//상속받은 자식클래스들
		Student s = new Student();
		s.name = "이순신";
		s.age = 30;
		s.studentId = "1231231";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.name = "홍길자";
		t.age = 40;
		t.subject = "역사";
		System.out.println(t.info());
		
	}
	
}