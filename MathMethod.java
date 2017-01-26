import java.util.Scanner;


public class MathMethod {
	public static void main(String[] args) {
		//variables
		Scanner scan = new Scanner(System.in);
		double base, power;
		int number;
		//input
		System.out.println("enter the base and power: ");
		base = scan.nextDouble();
		power = scan.nextDouble();
		
		System.out.println("What number would you like the square root of?");
		number = scan.nextInt();
		
		//processing & output
		double answer = Math.pow(base, power);
		System.out.println(base + "raised to the " + power + " is = " + answer);
		System.out.println("the square root of " + number + " is = " + Math.sqrt(number));
	}
}
