package Quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {
		
		/*
		 * 1. 날짜 클래스를 이용해서 file경로에 20250124.txt 이름으로 파일을 씁니다.
		 * 2. 내용은 "그만" 을 입력할 때 까지 작성해 주면 됩니다.
		 * 3. 파일을 썻다면, BufferedReader를 이용해서 파일의 내용을 읽어들이세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String result = sdf.format(date);
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\"+ result + ".txt";
		
		BufferedWriter bw = null;
		
		BufferedReader br = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(path, true));
			
			while(true) {
				System.out.print(">");
				String str = scan.nextLine();
				
				if(str.equals("그만")) {
					break;
				}
				str += "\r\n";
				bw.write(str);
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
			}
		}
		
		try {
			
			br = new BufferedReader(new FileReader(path));
			
			String str;
			while( (str = br.readLine() ) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}
