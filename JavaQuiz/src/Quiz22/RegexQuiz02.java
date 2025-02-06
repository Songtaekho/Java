package Quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		//상품번호, GS25, (상품명), 가격 분리해서 출력.
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(김혜자도시락) 6,000";
		String[] arr = {str, str2, str3};
		
		//패턴 4개
		String parttern1 = "\\d{6}-\\d{4,7}";
		String parttern2 = "[A-Z]{2}[0-9]{0,2}";
		String parttern3 = "[가-힣]{4,6}";
		String parttern4 = "[0-9]+,[0-9]+원?";
		
		for(String s : arr) {
			Matcher m1 = Pattern.compile(parttern1).matcher(s);
			
			if(m1.find()) {
				System.out.println("상품번호: " + m1.group());
			}
			
			Matcher m2 = Pattern.compile(parttern2).matcher(s);
			
			if(m2.find()) {
				System.out.println(m2.group());
			}
			
			Matcher m3 = Pattern.compile(parttern3).matcher(s);
			
			if(m3.find()) {
				System.out.println(m3.group());
			}
			
			Matcher m4 = Pattern.compile(parttern4).matcher(s);
			
			if(m4.find()) {
				System.out.println(m4.group());
			}
			System.out.println();
		}
	}
}
