package day04;

public class BreakEx03 {

	public static void main(String[] args) {
		
		
//		//탈출을 위한 변수
//		boolean bool = false;
//		
//		for(char u = 'A'; u <='Z'; u++) {
//			for(char l = 'a'; l <= 'z'; l++) {
//				System.out.println(u + "-" + l);
//				if(l == 'c') {
//					bool = true;
//					break;
//				}
//			} //inner
//			
//			if(bool) break;
//		
//		} // outer
//		
//				

				start:for(char u = 'A'; u <='Z'; u++) {
					for(char l = 'a'; l <= 'z'; l++) {
						System.out.println(u + "-" + l);
						if( l == 'c') break start;
					
					} //inner
					
				} // outer
		
		
	}
}
