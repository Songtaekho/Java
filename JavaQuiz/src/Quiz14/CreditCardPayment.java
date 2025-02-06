package Quiz14;

public class CreditCardPayment implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("신용카드로 [" +  amount + "]원을 결제합니다.");
	}

	@Override
	public boolean validatePaymentDetails(String details) {
		//return details.length() == 16; 밑에 쓴거를 더 짧게쓰면 이렇게도 가능	
		if (details.length() == 16) {
				System.out.println("카드 번호 형식이 일치합니다.");
				return true;
			} else {
				System.out.println("카드 번호 형식이 일치하지않습니다.");
				return false;
			}
		
	}
	
}
