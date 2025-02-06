package Quiz06;

import java.io.PrintStream;
import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		MyCart cart = new MyCart(1000);
		
		cart.buy("tv");
		cart.buy("com");
		cart.buy("radio");
		
	}
}