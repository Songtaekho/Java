package Quiz23;

public class MainClass {

	public static void main(String[] args) {
		
		DownLoad dl = new DownLoad();
		Thread thread = new Thread(dl);
		
		Video video = new Video();
		Thread thread2 = new Thread(video);
	
		
		thread.start();
		

		thread2.start();
		
		
		try {
			
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
}
