import java.util.Scanner;
import java.math.BigInteger;
public class Addingnumbers {

	public static void main(String[] args) {
		String number1, number2;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Please enter your number");
		number1 = in.nextLine();
		
		System.out.println("Please enter your second number");
		number2= in.nextLine();
	BigInteger first = new BigInteger(number1);
	BigInteger second = new BigInteger(number2);
	BigInteger sum;
	
	sum = first.add(second);
	
	System.out.println("Your total="+ sum);
	}
}