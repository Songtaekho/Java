package Quiz20;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueQuiz01 {

	public static void main(String[] args) {
		/*
		 * 은행 대기열 시뮬레이터
		 * 
		 * Queue 인터페이스와 LinkedList를 활용하여 대기열을 관리하세요.
		 * 손님 정보는 Customer라는 클래스로 생성하세요
		 * Customer은 name, arrivalTime을 가지고 있습니다.
		 * arrivalTime은 업무처리 소요시간 입니다
		 * 
		 * 손님은 60%의 확률로 도착하고 (랜덤.nextInt(100) < 60)
		 * 대기열이 비어있지 않을 때, 50%확률로 업무가 처리됩니다. (랜덤.nextInt(100) < 50)
		 * 
		 * 30회 시뮬레이터를 거쳤을 때, 총 소요시간과, 처리하지 못한 손님을 출력해 주세요.
		 * 
  			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			는 프로그램을 1초 정지 시키는 코드입니다
		 * 
		 * 
		 */
		Queue<Customer> queue = new LinkedList<>();
		Random ran = new Random();
		
		int i = 1;
		int sum = 0; //누적시간
		
		while(i <= 30) {
			
			if((ran.nextInt(100)) < 60 ) {
				queue.offer(new Customer("customer"+ i));
				System.out.println("customer" + i  +"님이 도착했습니다.");
			}
			
			System.out.println("현재 대기열:" + queue.toString());
			
			if(queue.size() > 0 && (ran.nextInt(100))  < 50) {
				Customer c = queue.poll();
				sum += c.getArrivalTime(); //시간 누적
				System.out.println(c.getName() + "님의 업무가 처리되었습니다.");	
			}

			i++;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("총 소요시간:" + sum);
		for(Customer m : queue) {
			System.out.print(m.getName() + " ");
		}
	}
}
