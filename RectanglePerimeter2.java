import java.util.Scanner;

/*
 * Adhithya Kondalsamy
 * 12/15/15
 * calculate the perimeter of a rectangle 
 * prompt the user for the width and height of the rectangle
 * display the perimeter
 */
public class RectanglePerimeter2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variable declarations
		Scanner keyboard = new Scanner (System.in);
		double height, width, perimeter;
		
		//prompt & read height & width
		System.out.println("Enter the height of the rectangle --> ");
		height = keyboard.nextDouble();
		System.out.print("Enter the width of the rectangle --> ");
		width = keyboard.nextDouble();
		
		perimeter = 2 * height + 2 * width;
		System.out.println("The perimeter is: " + perimeter);
		
	}

}
