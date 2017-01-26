/*
 * Adhithya Kondalsamy
 * 4/7/16
 * Period: 3
 * Code that asks for 3 values and displays the discriminant based on those values.
 */
import java.util.Scanner;


public class Discriminant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		double a, b, c, discriminant;
		//input
		Scanner keyboard = new Scanner(System.in);
		//processing
		System.out.println("enter value of a:");
		a = keyboard.nextDouble();
		System.out.println("enter value of b");
		b = keyboard.nextDouble();
		System.out.println("enter value of c");
		c = keyboard.nextDouble();
		discriminant = (b)*(b)- 4 * a * c;
		//output
		System.out.println("The discriminant is:" + discriminant);
		if (discriminant < 0)
			System.out.println("no roots");
		else if (discriminant == 0)
			System.out.println("one root");
		else if (discriminant > 0)
			System.out.println("two roots");
		
				
	}//end main

}//end Discriminant
