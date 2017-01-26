import java.util.Scanner;

/*Adhithya Kondalsamy
 * Prompts user for number of gallons and displays equivalent amount in quarts, 
 * pints, cups, and tablespoons.
 * 1/13/16
 */
public class GallonConverter {

	public static void main(String[] args) {
		//variables
		double quarts, gallons, pints, cups, tablespoons;
		//user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of gallons: ");
		//calculations
		gallons = keyboard.nextDouble();
		quarts = gallons * 4;
		pints = 8 * gallons;
		cups = 16 * gallons;
		tablespoons = 256 * gallons;
		//output
		System.out.print("In " + gallons);
		System.out.println(" gallons there are: ");
		System.out.println(quarts +" quarts");
		System.out.println(pints +" pints");
		System.out.println(cups +" cups");
		System.out.println(tablespoons +" tablespoons");
		

	}//end main

}//end class
