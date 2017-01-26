import java.util.Scanner;

/*Adhithya Kondalsamy
 * Prompts user for a time and outputs a height based on a set function.
 * 1/12/16
 */
public class ObjectHeight {
	public static void main(String[] args) {
		//variables
		double time, height;
		//constants
		final int INITIAL_HEIGHT = 100;
		//user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a time less than 4.5 seconds: ");
		//calculations
		time = keyboard.nextDouble();
		height = INITIAL_HEIGHT-(4.9)*(time*time);
		//output
		System.out.println(height + " meters");
	
	}//end main

}//end class
   