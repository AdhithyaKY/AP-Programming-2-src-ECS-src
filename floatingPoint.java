import java.util.Scanner;


public class floatingPoint {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter two floating point numbers: ");
		float number1 = keyboard.nextFloat();
		float number2 = keyboard.nextFloat();
		float sum = number1 + number2;
		float difference = number1 - number2;
		float product = number1 * number2;
		System.out.println("The sum of the numbers is " + sum);
		System.out.println("The difference between the numbers is " + difference);
		System.out.println("The product of the numbers is " + product);

	}

}
