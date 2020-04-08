public class Squaresnumbers {
	public static void main (String [] args) {
		int number;
		int square;
		int cube;
		
		System.out.println("Number\tSquare\tCube");
		
		for (number=1; number<5; number++);
		{
			square= number * number;//
			cube= number * square;
			System.out.println(number+"\t"+square+"\t"+cube);
		}
	}
}
