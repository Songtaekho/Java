package quiz01;

public class Quiz08 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요", "hello", "尼河吳", "#$%@"};
		
		
		/*
		 * 랜덤한 배열의 요소를 선택하고, 이 랜덤한 배열 요소에 따른 국가별 언어를 출력하면 됩니다.
		 * 
		 */
		
		int r = (int)(Math.random()* arr.length);
		
		arr = new String[4];
		
		arr[0] = "안녕하세요";
		arr[1] = "hello";
		arr[2] = "尼河吳";
		arr[3] = "#$%@";
		
		switch (r) {
		case 0:
			System.out.println("선택된단어:" + arr[r] + "\n 한국어 입니다.");
			break;
		case 1:
			System.out.println("선택된단어:" + arr[r] + "\n 영어 입니다.");
			break;
		case 2:
			System.out.println("선택된단어:" + arr[r] + "\n 중국어 입니다.");
			break;
		case 3:
			System.out.println("선택된단어:" + arr[r] + "\n 알수없는 언어입니다.");
			break;

		default:
			break;
		}
	}
}
