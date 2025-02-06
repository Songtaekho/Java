package Quiz23;

public class DownLoad implements Runnable {

	@Override
	public void run() {

		System.out.print("동영상 다운을 시작합니다:");

		for (int i = 1; i <= 10; i++) {

			System.out.print("*");

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}

//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		
//		System.out.print("동영상 다운로드를 시작합니다:");
//		for(int i = 1; i <= 10; i++) {
//			System.out.print("*");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		System.out.println();
		System.out.println("다운로드가 완료되었습니다.");
	}
}
