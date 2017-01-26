/*
 * Adhithya Kondalsamy
 * 9/29/16
 * Amberg
 * Code that inputs 2 sets of coordinates in the XY-plane and outputs the
 * distance between them.
 */
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		//variables
		Scanner keyboard = new Scanner(System.in);
		double coordX1, coordY1,coordX2,coordY2 , distance;
		//input
		System.out.println("Enter the x-coordinate for first point: ");
		coordX1 = keyboard.nextDouble();
		System.out.println("Enter the y-coordinate for first point: ");
		coordY1 = keyboard.nextDouble();
		System.out.println("Enter the x-coordinate for the second point: ");
		coordX2 = keyboard.nextDouble();
		System.out.println("Enter the y-coordinate for the second point: ");
		coordY2 = keyboard.nextDouble();
		//processing
		distance = Math.sqrt(Math.pow(coordX2-coordX1,2)+Math.pow(coordY2-coordY1,2) );
		//output
		System.out.println("The distance between the two points is: " + distance);
	}//end main

}//end Distance
