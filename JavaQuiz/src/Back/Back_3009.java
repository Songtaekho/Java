package Back;

import java.util.Scanner;

public class Back_3009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = 0;
		int y = 0;
		int firstx = 0;
		int firsty = 0;
		
		int x4 = 0;
		int y4 = 0;

		for (int i = 0; i < 3; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if (i == 0) {
				firstx = a;  //첫번쨰 좌표 저장
				firsty = b;
			} else if (i == 1) { //두번쨰 좌표 저장
				
					x = a;
					y = b;
			
			} else if (i == 2) {
				
				if(firstx == x) {
					x4= a;
				}else if(firstx != x && x == a) {
					x4= firstx;
				}else if(firstx != x && x != a) {
					x4= x;
				}
				
				if(firsty == y) {
					y4 = b;
				}else if(firsty != y && y == b) {
					y4 = firsty;
				}else if(firsty != y && y != b) {
					y4 = y;
				}
				
				
			}
	}
		System.out.println(x4 + " "+ y4);
	}
}