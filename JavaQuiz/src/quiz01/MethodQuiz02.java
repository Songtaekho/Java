package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
			String str = java(5);
			System.out.println(str);
			solution(60, 2, 3);
			
	}
	
	static String java(int a) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
			if(i % 2 !=0) {
				str +="자";
			} else if(i % 2 == 0) {
				str +="바";
			}
		}
		return str;
	}
	
	public static int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n ==0 && number % m == 0)
        	answer += 1;
        return answer;
    }
	
}