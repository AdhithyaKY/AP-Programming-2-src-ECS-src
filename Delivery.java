/*
 * Adhithya Kondalsamy
 * Period: 3
 * Code that prompts user for dimensions of a package and displays whether the dimensions
 * are acceptable or not.
 */

import java.util.Scanner;
public class Delivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		Scanner keyboard = new Scanner(System.in);
		int w, l, h;
		//input
		System.out.println("Enter the length, width, and height of the package: ");
		l = keyboard.nextInt();
		w = keyboard.nextInt();
		h = keyboard.nextInt();
		//processing
		if(h > 10 || l > 10 || w >20)
			System.out.println("Reject");
		else 
			System.out.println("Accept");
		
		
	}//end main
	
}//end Delivery
