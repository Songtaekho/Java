package Quiz14;

public class PayPalPayment implements Payment{
	String details = "1234123412341234";
	
	@Override
	public void pay(int amount) {
		System.out.println("PayPal로 [" + amount + "]원을 결제합니다.");
	}

	@Override
	public boolean validatePaymentDetails(String details) {
		//return pin.equals(details)
			if (this.details.equals(details)) {
				System.out.println("PIN번호가 일치합니다.");
			return true;
			} else {
				System.out.println("PIN번호가 일치하지 않습니다.");
				return false;
			}
		
	}

}
