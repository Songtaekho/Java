package Back;

import java.util.Arrays;
import java.util.Scanner;

public class Back_11718_copy {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		 // 무한 루프를 통해 입력을 계속 받음
        while(scan.hasNextLine()) { //hasNextLine() - 메서드를 사용하여 입력이 더 이상 없을 때까지 계속 읽습니다.
            String str = scan.nextLine();
            System.out.println(str);
        }
        scan.close();
    }
}