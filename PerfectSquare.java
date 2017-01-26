/*
 * Adhithya Kondalsamy
 * Period: 3
 * Mrs. Amberg
 * Code that prompts user for an integer and checks whether the integer is a perfect square
 * or not.
 */
import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		Scanner keyboard = new Scanner(System.in);
		int number, squareRoot;
		//input
		System.out.println("Enter an integer: ");
		number = keyboard.nextInt();
		//processing
		squareRoot = (int) Math.sqrt(number);
		if(number == squareRoot * squareRoot)
			System.out.println("The number is a perfect square");
		else
			System.out.println("The number is not a perfect square");
			
	}//end main	

}//end PerfectSquare
