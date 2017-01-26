import java.util.Scanner;
import java.text.DecimalFormat;

public class SphereFormulas {

	public static void main(String[] args) {
		// variables
		Scanner keyboard = new Scanner(System.in);
		double radius, surfaceArea, volume;
		// input
		System.out.println("Enter the radius of the sphere: ");
		radius = keyboard.nextDouble();
		// processing
		volume = (4.0 / 3) * (Math.PI) * (Math.pow(radius, 3));
		surfaceArea = (4) * (Math.PI) * (Math.pow(radius, 2));
		DecimalFormat fourPlaces = new DecimalFormat(".####");
		// output
		System.out.println("The volume of the sphere is: "
				+ fourPlaces.format(volume));
		System.out.println("The surface area of the sphere is: " + fourPlaces
				.format(surfaceArea));
	}//end main

}//end SphereFormulas
