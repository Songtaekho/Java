package Quiz14;

public interface Payment {

	void pay (int amount);
	
	boolean validatePaymentDetails(String details);
}