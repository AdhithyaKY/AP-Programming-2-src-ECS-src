import java.util.Scanner;

/*
 * Adhithya Kondalsamy
 * 4/28/16
 * Period: 3
 * Amberg 
 * Prompts the user for values a,b,c and displays the roots.
 */
public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		double a, b, c, root, root2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the value for a: ");
		a = keyboard.nextDouble();
		System.out.println("Enter value for b: ");
		b = keyboard.nextDouble();
		System.out.println("Enter value for c: ");
		c = keyboard.nextDouble();
		//processing
		root = 0-b + Math.sqrt(b * b - 4*a*c)/(2 * a);
		root2 = 0+b + Math.sqrt(b * b - 4*a*c)/(2 * a); 
		//output
		System.out.println("The two roots are " +root + " and "  + root2);
	}//end main

}//end Quadratic
