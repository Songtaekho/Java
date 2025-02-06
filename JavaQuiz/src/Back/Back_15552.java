package Back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Back_15552 {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int a = br.read();
			
			
			
			for(int i = 0; i < a; i++) {
				int b = br.read();
				int c = br.read();
				int d = b + c;
				bw.write(d);
				bw.flush();
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
			}
		}
		
		

		
	}
}
