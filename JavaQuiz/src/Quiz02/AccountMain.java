package Quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account account = new Account("홍길동", "password", 50000);
		account.info();
		account.getBalance();
		account.deposit(100000);
		account.withDraw(30000,"password");
		account.getBalance();
		
		Account account2 = new Account("홍길동", "password", 50000);
		account.info();
		account.getBalance();
		account.deposit(100000);
		account.withDraw(30000,"pass");
		account.getBalance();
		
	}
}