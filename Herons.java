/*
 * Adhithya Kondalsamy
 * Amberg
 * 9/29/16
 * Code that inputs the 3 sides of a triangle and determines the area of that 
 * triangle.  
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Herons {

	public static void main(String[] args) {
		// variables
		Scanner keyboard = new Scanner(System.in);
		double side1, side2, side3, halfPerimeter, area;
		// input
		System.out.println("Enter the length of the first side: ");
		side1 = keyboard.nextDouble();
		System.out.println("Enter the length of the second side: ");
		side2 = keyboard.nextDouble();
		System.out.println("Enter the length of the third side: ");
		side3 = keyboard.nextDouble();
		// processing
		DecimalFormat threePlaces = new DecimalFormat("0.000");
		halfPerimeter = (side1 + side2 + side3) / 2.0;
		area = Math.sqrt((halfPerimeter) * (halfPerimeter - side1)
				* (halfPerimeter - side2) * (halfPerimeter - side3));
		// output
		System.out.println(threePlaces.format(area));
	}//end main

}//end Herons
