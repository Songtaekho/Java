package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me.setYear(2026);
		me.setYear(2025);
		me.setMonth(1);
		me.setDay(14);
		me.setSsn("2501141234567");
		
		int year = me.getYear();
		System.out.println("년도:" + year);
		
		int month = me.getMonth();
		System.out.println("월:" + month);
		
		int day = me.getDay();
		System.out.println("일:" + day);
		
		String ssn = me.getSsn();
		System.out.println("주민번호:" + ssn);
	}
}