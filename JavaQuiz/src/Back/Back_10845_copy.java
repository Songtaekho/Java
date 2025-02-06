package Back;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Back_10845_copy {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Queue<Integer> queue = new LinkedList<>();

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			String str = scan.next();

			if (str.equals("push")) {
				queue.offer(scan.nextInt());
			}

			if (str.equals("front") && queue.size() > 0) {
				System.out.println(queue.peek());
			} else if (str.equals("front") && queue.size() < 1) {
				System.out.println(-1);

			}
			if (str.equals("back") && queue.size() > 0) {
				int a = 0;
				int b = 0;
				while (b < queue.size()) {
					a = queue.poll();
					b++;
					queue.offer(a);
				}

				System.out.println(a);

			} else if (str.equals("back") && queue.size() < 1) {
				System.out.println(-1);
			}

			if (str.equals("size")) {
				System.out.println(queue.size());
			}

			if (str.equals("pop") && queue.size() > 0) {
				System.out.println(queue.poll());
			} else if (str.equals("pop") && queue.size() < 1) {
				System.out.println(-1);
			}

			if (str.equals("empty")) {
				if (queue.size() > 0) {
					System.out.println(0);
				} else {
					System.out.println(1);
				}
			}
		}

	}

}
