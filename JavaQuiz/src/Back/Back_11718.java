package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Back_11718 { // 못풀어서 챗 GPT물어봄
	
	 public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        
	        // `nextLine()`을 한 번만 받는 방식
	        for (int i = 0; i < 100; i++) {
	            try {
	                String str = scan.nextLine();  // 입력 받기
	                System.out.println(str);  // 출력
	            } catch (Exception e) {
	                break;  // 예외 발생 시 종료
	            }
	        }
	        
	        scan.close();  // Scanner 닫기
	    }
	}