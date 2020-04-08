import java.util.Scanner;
public class greatestnumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	System.out.print("Please put your first number");
		int num1 = in.nextInt();
	System.out.print("Please put your second number");
		int num2 = in.nextInt();
	System.out.print("Please put your third number");
		int num3 = in.nextInt();
	
	if(num1>num2)
		if(num1>num3)
			System.out.println("The greatest number is:" +num1);
	if(num2>num1)
		if(num2>num3)
			System.out.println("The greates number is:" +num2);
	if(num3>num1)
		if(num3>num2)
			System.out.println("The greates number is:" + num3);
	}
}
