package Back;

import java.util.Scanner;

public class Back_2920 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();

		String asc = "1 2 3 4 5 6 7 8";
		String des = "8 7 6 5 4 3 2 1";

		if (str.equals(asc)) {
			System.out.println("ascending");
		} else if (str.equals(des)) {
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}

	}

}
