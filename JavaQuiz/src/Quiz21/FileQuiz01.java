package Quiz21;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {
		/*
		 * 1. 스캐너를 이용해서 파일명을 입력 받습니다.
		 * 2. file폴더 하위에 입력받은 파일명으로 파일을 씁니다.
		 * 3. 파일을 쓸 때, "쓰고 싶은 말"을 사용자에게 입력 받습니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		String name = scan.next();
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + name + ".txt";
		
		Writer fw = null;
		
		try {
			fw = new FileWriter(path);
			scan.nextLine();
			
			System.out.println("쓰고 싶은 말>");
			String str = scan.nextLine();
			
			fw.write(str);
			
			System.out.println("파일 출력 완료!!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
